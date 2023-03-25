package wf3.project.alpha_betise.mappers;

import org.mapstruct.Mapper;

import wf3.project.alpha_betise.config.MapperInjectionConfig;
import wf3.project.alpha_betise.dtos.EditeurDto;
import wf3.project.alpha_betise.entities.Editeur;

@Mapper(config = MapperInjectionConfig.class)
public interface EditeurMapper extends EntityDtoMapper<Editeur, EditeurDto> {

}
