package wf3.project.alpha_betise.mappers;

import org.mapstruct.Mapper;

import wf3.project.alpha_betise.config.MapperInjectionConfig;
import wf3.project.alpha_betise.dtos.categorieLivreDto.CategorieLivreDto;
import wf3.project.alpha_betise.entities.CategorieLivre;

@Mapper(config = MapperInjectionConfig.class)
public interface CategorieMapper extends EntityDtoMapper<CategorieLivre, CategorieLivreDto> {

}
