package wf3.project.alpha_betise.mappers;

import org.mapstruct.Mapper;

import wf3.project.alpha_betise.config.MapperInjectionConfig;
import wf3.project.alpha_betise.dtos.LivreDto;
import wf3.project.alpha_betise.entities.Livre;

@Mapper(config = MapperInjectionConfig.class)
public interface LivreMapper extends EntityDtoMapper<Livre, LivreDto> {

}
