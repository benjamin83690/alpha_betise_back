package wf3.project.alpha_betise.entities;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "photos_livre")
public class PhotoLivre {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NonNull
	private Integer id;

	@Column(name = "path_url")
	private String pathUrl;

	@ManyToOne
	@JoinColumn(name = "livre_isbn")
	private Livre livre;
}
