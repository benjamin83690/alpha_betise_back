package wf3.project.alpha_betise.dtos.commadeDto;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import wf3.project.alpha_betise.dtos.DetailCommandeDto;
import wf3.project.alpha_betise.dtos.etatCommandeDto.EtatCommandeDto;
import wf3.project.alpha_betise.entities.Utilisateur;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommandeDto {

	private Long id;

	private LocalDate dateCommande;

	private Integer prixTotal;

	private String rue;

	private String ville;

	private Integer codePostal;

	private Utilisateur utilisateurId;

	private List<DetailCommandeDto> detailsCommande;

	private EtatCommandeDto etatCommande;
}
