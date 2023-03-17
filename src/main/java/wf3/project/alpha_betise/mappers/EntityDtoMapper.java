package wf3.project.alpha_betise.mappers;

import java.util.List;

public interface EntityDtoMapper<ENTITY, DTO> {

	ENTITY toEntity(DTO src);

	DTO toDto(ENTITY src);

	List<ENTITY> toEntities(List<DTO> dtos);

	List<DTO> toDtos(List<ENTITY> entities);
}
