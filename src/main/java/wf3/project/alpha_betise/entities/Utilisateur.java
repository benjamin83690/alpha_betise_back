package wf3.project.alpha_betise.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
}
