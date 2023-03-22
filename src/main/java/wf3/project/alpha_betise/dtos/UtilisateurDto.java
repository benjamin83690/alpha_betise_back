package wf3.project.alpha_betise.dtos;

import java.util.List;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import wf3.project.alpha_betise.entities.Role;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UtilisateurDto {

	private Long id;

	private String nom;

	private String prenom;

	private String email;

	private String photo;

	@Enumerated(EnumType.STRING)
	private Role role;

	private List<EvenementUtilisateurDto> evenementId;

	private List<CommandeUtilisateurDto> commandes;
}
