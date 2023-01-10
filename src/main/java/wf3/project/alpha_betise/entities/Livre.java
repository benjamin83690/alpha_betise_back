package wf3.project.alpha_betise.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "livres")
public class Livre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull
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
