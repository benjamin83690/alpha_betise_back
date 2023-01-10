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
@Table(name = "details_commande")
public class DetailCommande {

	@EmbeddedId
	private DetailCommandePK id;

	@ManyToOne
	@MapsId("livreIsbn")
	@JoinColumn(name = "livre_isbn")
	private Livre livre;

	@ManyToOne
	@MapsId("commandeId")
	@JoinColumn(name = "commande_id")
	private Commande commande;

	@NonNull
	private Integer quantite;
}
