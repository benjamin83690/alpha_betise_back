package wf3.project.alpha_betise.dtos.auteurDto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import wf3.project.alpha_betise.dtos.LivreTitreDto;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuteurDto {

	private Long id;
	private String nom;
	private List<LivreTitreDto> livres;
}
