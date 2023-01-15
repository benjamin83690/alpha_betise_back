package wf3.project.alpha_betise.entities;

import java.time.LocalDate;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "commandes")
public class Commande {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NonNull
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name = "date_commande")
	private LocalDate dateCommande;

	@NonNull
	@Column(name = "prix_total")
	private Integer prixTotal;

	@NonNull
	private String rue;

	@NonNull
	private String ville;

	@NonNull
	@JoinColumn(name = "code_postal")
	private Integer codePostal;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "utilisateur_id")
	private Utilisateur utilisateurId;

	@OneToMany(mappedBy = "commande", cascade = CascadeType.REMOVE)
	private List<DetailCommande> detailsCommande;

	@ManyToOne
	@JoinColumn(name = "etat_commande_id")
	private EtatCommande etatCommande;
}
