package wf3.project.alpha_betise.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

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
	@NonNull
	@Column(name = "evenement_id")
	private Integer id;

	@NonNull
	private String titre;

	@Column(name = "max_participants")
	private Integer maxParticipants;

	@Column(name = "age_public")
	private String agePublic;

	private Float prix;

	private String lieu;

	@NonNull
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate date;

	@ManyToMany(mappedBy = "evenementId")
	private List<Utilisateur> utilisateurs;
}
