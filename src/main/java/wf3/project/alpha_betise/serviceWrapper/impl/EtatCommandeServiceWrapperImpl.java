package wf3.project.alpha_betise.serviceWrapper.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import wf3.project.alpha_betise.dtos.etatCommandeDto.EtatCommandeDto;
import wf3.project.alpha_betise.mappers.EtatCommandeMapper;
import wf3.project.alpha_betise.serviceWrapper.EtatCommandeServiceWrapper;
import wf3.project.alpha_betise.services.EtatCommandeService;

@Component
@Transactional
public class EtatCommandeServiceWrapperImpl implements EtatCommandeServiceWrapper {

	@Autowired
	private EtatCommandeService etatCommandeService;

	@Autowired
	private EtatCommandeMapper etatCommandeMapper;

	@Override
	public List<EtatCommandeDto> getAll() {
		return etatCommandeMapper.toDtos(etatCommandeService.getAll());
	}

	@Override
	public EtatCommandeDto get(Long id) throws Exception {
		return etatCommandeMapper.toDto(etatCommandeService.get(id));
	}

	@Override
	public EtatCommandeDto post(EtatCommandeDto etatCommande) {
		return etatCommandeMapper.toDto(etatCommandeService.post(etatCommandeMapper.toEntity(etatCommande)));
	}

	@Override
	public void delete(Long id) {
		etatCommandeService.delete(id);
	}

}
