package wf3.project.alpha_betise.serviceWrapper.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import wf3.project.alpha_betise.dtos.EvenementDto;
import wf3.project.alpha_betise.mappers.EvenementMapper;
import wf3.project.alpha_betise.serviceWrapper.EvenementServiceWrapper;
import wf3.project.alpha_betise.services.EvenementService;

@Component
@Transactional
public class EvenementServiceWrapperImpl implements EvenementServiceWrapper {

	@Autowired
	private EvenementService evenementService;

	@Autowired
	private EvenementMapper evenementMapper;

	@Override
	public List<EvenementDto> getAll() {
		return evenementMapper.toDtos(evenementService.getAll());
	}

	@Override
	public EvenementDto get(Long id) throws Exception {
		return evenementMapper.toDto(evenementService.get(id));
	}

	@Override
	public EvenementDto post(EvenementDto evenement) {
		return evenementMapper.toDto(evenementService.post(evenementMapper.toEntity(evenement)));
	}

	@Override
	public void delete(Long id) {
		evenementService.delete(id);
	}

	@Override
	public List<EvenementDto> getNextEvent() {
		return evenementMapper.toDtos(evenementService.getNextEvent());
	}

	@Override
	public List<EvenementDto> getPastEvent() {
		return evenementMapper.toDtos(evenementService.getPastEvent());
	}

}
