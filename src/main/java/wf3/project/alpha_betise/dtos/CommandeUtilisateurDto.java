package wf3.project.alpha_betise.dtos;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import wf3.project.alpha_betise.entities.EtatCommande;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommandeUtilisateurDto {

	private Long id;

	private LocalDate dateCommande;

	private Integer prixTotal;

	private String rue;

	private String ville;

	private Integer codePostal;

	private List<DetailCommandeDto> detailsCommande;

	private EtatCommande etatCommande;
}
