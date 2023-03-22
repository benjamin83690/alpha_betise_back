package wf3.project.alpha_betise.mappers;

import org.mapstruct.Mapper;

import wf3.project.alpha_betise.config.MapperInjectionConfig;
import wf3.project.alpha_betise.dtos.AuteurDto;
import wf3.project.alpha_betise.entities.Auteur;

@Mapper(config = MapperInjectionConfig.class)
public interface AuteurMapper extends EntityDtoMapper<Auteur, AuteurDto> {

}
