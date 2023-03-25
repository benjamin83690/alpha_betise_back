package wf3.project.alpha_betise.mappers;

import org.mapstruct.Mapper;

import wf3.project.alpha_betise.config.MapperInjectionConfig;
import wf3.project.alpha_betise.dtos.etatStockDto.EtatStockDto;
import wf3.project.alpha_betise.entities.EtatStock;

@Mapper(config = MapperInjectionConfig.class)
public interface EtatStockMapper extends EntityDtoMapper<EtatStock, EtatStockDto> {

}
