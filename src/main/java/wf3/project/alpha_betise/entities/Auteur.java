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
@Table(name = "auteurs")
public class Auteur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NonNull
	private Integer id;

	@NonNull
	private String nom;

	@ManyToMany(mappedBy = "auteurs")
	private List<Livre> livres;
}
