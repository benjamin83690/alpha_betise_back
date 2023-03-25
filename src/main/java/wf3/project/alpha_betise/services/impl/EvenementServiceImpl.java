package wf3.project.alpha_betise.services.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import wf3.project.alpha_betise.entities.Evenement;
import wf3.project.alpha_betise.repositories.EvenementRepository;
import wf3.project.alpha_betise.services.EvenementService;

@Service
@Transactional
public class EvenementServiceImpl implements EvenementService {

	@Autowired
	private EvenementRepository evenementRepository;

	@Override
	public List<Evenement> getAll() {
		return evenementRepository.findAll();
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
	public List<Evenement> getNextEvent() {
		return evenementRepository.getNextEvent(LocalDate.now());
	}

	@Override
	public List<Evenement> getPastEvent() {
		return evenementRepository.getPastEvent(LocalDate.now());
	}

}
