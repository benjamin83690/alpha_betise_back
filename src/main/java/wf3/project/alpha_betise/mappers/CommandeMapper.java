package wf3.project.alpha_betise.mappers;

import org.mapstruct.Mapper;

import wf3.project.alpha_betise.config.MapperInjectionConfig;
import wf3.project.alpha_betise.dtos.commadeDto.CommandeDto;
import wf3.project.alpha_betise.entities.Commande;

@Mapper(config = MapperInjectionConfig.class)
public interface CommandeMapper extends EntityDtoMapper<Commande, CommandeDto> {

}
