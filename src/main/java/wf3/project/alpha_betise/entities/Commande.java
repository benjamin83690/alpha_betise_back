package wf3.project.alpha_betise.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "commandes")
public class Commande {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NonNull
	private Integer id;

	@NonNull
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name = "date_commande")
	private LocalDate dateCommande;

	@NonNull
	@Column(name = "prix_total")
	private Integer prixTotal;

	@NonNull
	@Column(name = "adresse_livraison")
	private String adresseLivraison;

	@NonNull
	@Column(name = "adresse_facturation")
	private String adresseFacturation;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "utilisateur_id")
	private Utilisateur utilisateurId;

	@OneToMany(mappedBy = "commande", cascade = CascadeType.REMOVE)
	private List<DetailCommande> detailsCommande;
}
