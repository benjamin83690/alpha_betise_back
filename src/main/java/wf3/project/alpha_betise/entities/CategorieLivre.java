package wf3.project.alpha_betise.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "categories_livre")
public class CategorieLivre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull
    private Integer id;

    @NonNull
    private String libelle;
}
