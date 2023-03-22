package wf3.project.alpha_betise.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import wf3.project.alpha_betise.entities.DetailCommandePK;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DetailCommandeDto {

	private DetailCommandePK id;

	private LivreTitreDto livre;

	private Integer quantite;
}
