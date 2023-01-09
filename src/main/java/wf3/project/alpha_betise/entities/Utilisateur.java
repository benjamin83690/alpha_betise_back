package wf3.project.alpha_betise.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "utilisateurs")
public class Utilisateur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NonNull
	@Column(name = "utilisateur_id")
	private Integer id;

	@NonNull
	private String nom;

	@NonNull
	private String prenom;

	@NonNull
	private String email;

	@NonNull
	private String motDePasse;

	@NonNull
	private Short age;

	private String photo;
	
	@ManyToOne
	@JoinColumn(name = "role_id", nullable = false)
	private Role role;

	@ManyToMany
	@JoinTable(name = "evenements_utilisateur", joinColumns = @JoinColumn(name = "utilisateur_id"), inverseJoinColumns = @JoinColumn(name = "evenement_id"))
	private List<Evenement> evenementId;

	@OneToMany(mappedBy = "utilisateurId", cascade = CascadeType.ALL)
	private List<CommentaireUtilisateur> commentaires;

	@OneToMany(mappedBy = "utilisateurId")
	private List<Commande> commandes;
}
