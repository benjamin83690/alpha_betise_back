package wf3.project.alpha_betise.mappers;

import org.mapstruct.Mapper;

import wf3.project.alpha_betise.config.MapperInjectionConfig;
import wf3.project.alpha_betise.dtos.etatCommandeDto.EtatCommandeDto;
import wf3.project.alpha_betise.entities.EtatCommande;

@Mapper(config = MapperInjectionConfig.class)
public interface EtatCommandeMapper extends EntityDtoMapper<EtatCommande, EtatCommandeDto> {

}
