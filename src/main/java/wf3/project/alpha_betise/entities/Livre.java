package wf3.project.alpha_betise.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

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
}
