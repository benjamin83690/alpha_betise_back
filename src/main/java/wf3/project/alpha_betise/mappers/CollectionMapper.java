package wf3.project.alpha_betise.mappers;

import org.mapstruct.Mapper;

import wf3.project.alpha_betise.config.MapperInjectionConfig;
import wf3.project.alpha_betise.dtos.collectionDto.CollectionDto;
import wf3.project.alpha_betise.entities.Collection;

@Mapper(config = MapperInjectionConfig.class)
public interface CollectionMapper extends EntityDtoMapper<Collection, CollectionDto> {

}
