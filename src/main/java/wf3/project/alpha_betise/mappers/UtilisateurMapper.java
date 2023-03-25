package wf3.project.alpha_betise.mappers;

import org.mapstruct.Mapper;

import wf3.project.alpha_betise.config.MapperInjectionConfig;
import wf3.project.alpha_betise.dtos.utilisateurDto.UtilisateurDto;
import wf3.project.alpha_betise.entities.Utilisateur;

@Mapper(config = MapperInjectionConfig.class)
public interface UtilisateurMapper extends EntityDtoMapper<Utilisateur, UtilisateurDto> {

}
