package wf3.project.alpha_betise.entities;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "evenements")
public class Evenement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "evenement_id")
	private Integer id;

	@NonNull
	private String titre;

	@Column(name = "max_participants")
	private Integer maxParticipants;

	@Column(name = "age_public")
	private String agePublic;

	private Float prix;

	private String rue;

	private String ville;

	private Integer codePostal;

	@NonNull
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private LocalDate date;

	@NonNull
	@DateTimeFormat(pattern = "HH:mm")
	private LocalTime heureDuRdv;

	@ManyToMany(mappedBy = "evenementId")
	private List<Utilisateur> utilisateurs;

	@ManyToOne
	@JoinColumn(name = "livre_isbn")
	private Livre livre;

	@ManyToMany(cascade = CascadeType.REMOVE)
	@JoinTable(name = "auteurs_evenement", joinColumns = @JoinColumn(name = "evenement_id"), inverseJoinColumns = @JoinColumn(name = "auteur_id"))
	private List<Auteur> auteurs;
}
