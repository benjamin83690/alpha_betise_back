package wf3.project.alpha_betise.services.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import wf3.project.alpha_betise.dtos.EvenementDto;
import wf3.project.alpha_betise.entities.Evenement;
import wf3.project.alpha_betise.mappers.EvenementMapper;
import wf3.project.alpha_betise.repositories.EvenementRepository;
import wf3.project.alpha_betise.services.EvenementService;

@Service
@Transactional
public class EvenementServiceImpl implements EvenementService {

	@Autowired
	private EvenementRepository evenementRepository;

	@Autowired
	private EvenementMapper evenementMapper;

	@Override
	public List<EvenementDto> getAll() {
		return evenementMapper.toDtos(evenementRepository.findAll());
	}

	@Override
	public Evenement get(Long id) throws Exception {
		return evenementRepository.findById(id).orElseThrow(() -> new Exception("Evenement introuvable."));
	}

	@Override
	public Evenement post(Evenement evenement) {
		return evenementRepository.save(evenement);
	}

	@Override
	public void delete(Long id) {
		evenementRepository.deleteById(id);
	}

	@Override
	public List<EvenementDto> getNextEvent() {
		return evenementMapper.toDtos(evenementRepository.getNextEvent(LocalDate.now()));
	}

	@Override
	public List<EvenementDto> getPastEvent() {
		return evenementMapper.toDtos(evenementRepository.getPastEvent(LocalDate.now()));
	}

}
