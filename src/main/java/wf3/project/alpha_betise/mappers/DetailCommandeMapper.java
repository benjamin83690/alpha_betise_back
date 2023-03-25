package wf3.project.alpha_betise.mappers;

import org.mapstruct.Mapper;

import wf3.project.alpha_betise.config.MapperInjectionConfig;
import wf3.project.alpha_betise.dtos.DetailCommandeDto;
import wf3.project.alpha_betise.entities.DetailCommande;

@Mapper(config = MapperInjectionConfig.class)
public interface DetailCommandeMapper extends EntityDtoMapper<DetailCommande, DetailCommandeDto> {

}
