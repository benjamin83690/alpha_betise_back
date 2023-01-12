package wf3.project.alpha_betise.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "categories_livre")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class CategorieLivre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    @NonNull
    private String libelle;

    @OneToMany(mappedBy = "categorieLivre")
    private List<Livre> livres;
}
