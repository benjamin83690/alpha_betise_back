package wf3.project.alpha_betise.entities;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "collections")

public class CollectionLivre {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NonNull
	private String nom;

	@OneToMany(mappedBy = "collectionLivre")
	private List<Livre> livres;
	
}
