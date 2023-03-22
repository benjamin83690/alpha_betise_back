package wf3.project.alpha_betise.dtos;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EvenementUtilisateurDto {

	private Long id;

	private String titre;

	private String agePublic;

	private Float prix;

	private String rue;

	private String ville;

	private String codePostal;

	private String description;

	private LocalDate date;

	private LocalTime heureEvenement;
}
