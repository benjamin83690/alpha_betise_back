package wf3.project.alpha_betise.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import wf3.project.alpha_betise.entities.Langue;
import wf3.project.alpha_betise.repositories.LangueRepository;
import wf3.project.alpha_betise.services.LangueService;

@Service
@Transactional
public class LangueServiceImpl implements LangueService {

	@Autowired
	public LangueRepository langueRepository;

	@Override
	public List<Langue> getAll() {
		return langueRepository.findAll();
	}

	@Override
	public Langue get(Integer id) throws Exception {
		return langueRepository.findById(id).orElseThrow(() -> new Exception("Element introuvable"));
	}

	@Override
	public Langue post(Langue langue) {
		return langueRepository.save(langue);
	}

	@Override
	public void delete(Integer id) {
		langueRepository.deleteById(id);
	}

}
