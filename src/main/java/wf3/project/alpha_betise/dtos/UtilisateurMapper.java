package wf3.project.alpha_betise.dtos;

import org.mapstruct.Mapper;

import wf3.project.alpha_betise.config.MapperInjectionConfig;
import wf3.project.alpha_betise.entities.Utilisateur;
import wf3.project.alpha_betise.mappers.EntityDtoMapper;

@Mapper(config = MapperInjectionConfig.class)
public interface UtilisateurMapper extends EntityDtoMapper<Utilisateur, UtilisateurDto> {

}
