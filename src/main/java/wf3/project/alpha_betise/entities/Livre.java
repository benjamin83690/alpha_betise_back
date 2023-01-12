package wf3.project.alpha_betise.entities;

import java.time.LocalDate;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "livres")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "isbn", scope = Livre.class)
public class Livre {

    @Id
	private Long isbn;

    @NonNull
    private String titre;

    @NonNull
    private Float prix;

    @NonNull
	@Column(columnDefinition = "text")
    private String resume;

    private String libraireCom;

    @NonNull
    private Integer nbPages;

    @NonNull
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate datePublication;

    @NonNull
	private Float poids;

    @NonNull
    private Integer nbExemplaires;

    @NonNull
    private Float longueur;

    @NonNull
    private Float largeur;

    @NonNull
    private Float epaisseur;

	@ManyToOne
    @JoinColumn(name = "categorie_livre_id")
//	@JsonIgnore
    private CategorieLivre categorieLivre;

	@ManyToOne
    @JoinColumn(name = "collection_id")
    private CollectionLivre collectionLivre;

	@ManyToOne
    @JoinColumn(name = "editeur_id")
    private Editeur editeur;

	@OneToMany(mappedBy = "livre", cascade = CascadeType.REMOVE)
    private List<PhotoLivre> photosLivre;

	@ManyToOne
    @JoinColumn(name = "langue_id")
    private Langue langue;

	@ManyToOne
    @JoinColumn(name = "etat_stock_id")
    private EtatStock etatStock;

	@OneToMany(mappedBy = "livre", cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    private List<CommentaireUtilisateur> commentairesUtilsateur;

	@ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "auteurs_livres",
			joinColumns = @JoinColumn(name = "livre_isbn"), inverseJoinColumns = @JoinColumn(name = "auteur_id"))
    private List<Auteur> auteurs;

	@OneToMany(mappedBy = "livre", fetch = FetchType.LAZY)
    private List<DetailCommande> detailsCommande;

}
