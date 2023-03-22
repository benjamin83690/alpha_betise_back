package wf3.project.alpha_betise.mappers;

import org.mapstruct.Mapper;

import wf3.project.alpha_betise.config.MapperInjectionConfig;
import wf3.project.alpha_betise.dtos.EvenementDto;
import wf3.project.alpha_betise.entities.Evenement;

@Mapper(config = MapperInjectionConfig.class)
public interface EvenementMapper extends EntityDtoMapper<Evenement, EvenementDto> {
}
