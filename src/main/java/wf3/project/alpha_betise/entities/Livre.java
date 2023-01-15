package wf3.project.alpha_betise.entities;

import java.time.LocalDate;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
public class Livre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer isbn;

    @NonNull
    private String titre;

    @NonNull
    private Float prix;

    @NonNull
    private String resume;

    @Column(name = "libraire_com")
    private String libraireCom;

    @NonNull
    @Column(name = "nb_pages")
    private Integer nbPages;

    @NonNull
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Column(name = "date_publication")
    private LocalDate datePublication;

    @NonNull
    private Float poids;

    @NonNull
    @Column(name = "nb_exemplaires")
    private Integer nbExemplaires;

    @NonNull
    private Float longueur;

    @NonNull
    private Float largeur;

    @NonNull
    private Float epaisseur;

    @ManyToOne
    @JoinColumn(name = "categorie_livre_id")
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

    @OneToMany(mappedBy = "livre", cascade = CascadeType.REMOVE)
    private List<CommentaireUtilisateur> commentairesUtilsateur;

    @ManyToMany
    @JoinTable(
            name = "auteurs_livres",
            joinColumns = @JoinColumn(name = "auteur_id"),
            inverseJoinColumns = @JoinColumn(name = "livre_isbn"))
    private List<Auteur> auteurs;

    @OneToMany(mappedBy = "livre")
    private List<DetailCommande> detailsCommande;

}
