package wf3.project.alpha_betise.serviceWrapper.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import wf3.project.alpha_betise.dtos.etatStockDto.EtatStockDto;
import wf3.project.alpha_betise.mappers.EtatStockMapper;
import wf3.project.alpha_betise.serviceWrapper.EtatStockServiceWrapper;
import wf3.project.alpha_betise.services.EtatStockService;

@Component
@Transactional
public class EtatStockServiceWrapperImpl implements EtatStockServiceWrapper {

	@Autowired
	private EtatStockService etatStockService;

	@Autowired
	private EtatStockMapper etatStockMapper;

	@Override
	public List<EtatStockDto> getAll() {
		return etatStockMapper.toDtos(etatStockService.getAll());
	}

	@Override
	public EtatStockDto get(Long id) throws Exception {
		return etatStockMapper.toDto(etatStockService.get(id));
	}

	@Override
	public EtatStockDto post(EtatStockDto etatStock) {
		return etatStockMapper.toDto(etatStockService.post(etatStockMapper.toEntity(etatStock)));
	}

	@Override
	public void delete(Long id) {
		etatStockService.delete(id);
	}

}
