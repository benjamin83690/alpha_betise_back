package wf3.project.alpha_betise.dtos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EditeurDto {

	private Long id;

	private String nom;

	private List<LivreTitreDto> livres;
}
