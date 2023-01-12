package wf3.project.alpha_betise.entities;

import java.time.LocalDate;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
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
	private Long id;

	@NonNull
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate dateCommande;

	@NonNull
	private Integer prixTotal;

	@NonNull
	private String rue;

	@NonNull
	private String ville;

	@NonNull
	private Integer codePostal;

	@ManyToOne(fetch = FetchType.LAZY)
	private Utilisateur utilisateurId;

	@OneToMany(mappedBy = "commande", cascade = CascadeType.REMOVE)
	private List<DetailCommande> detailsCommande;

	@ManyToOne
	@JoinColumn(name = "etat_commande_id")
	@JsonIgnore
	private EtatCommande etatCommande;
}
