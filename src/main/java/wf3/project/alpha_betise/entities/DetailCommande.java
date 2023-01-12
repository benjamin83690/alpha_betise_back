package wf3.project.alpha_betise.entities;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "details_commande")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class DetailCommande implements Serializable {

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
