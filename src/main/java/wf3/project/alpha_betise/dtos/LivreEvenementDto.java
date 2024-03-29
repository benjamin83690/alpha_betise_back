package wf3.project.alpha_betise.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LivreEvenementDto {

	private Long isbn;
	private String titre;
	private String photoLivre;
}
