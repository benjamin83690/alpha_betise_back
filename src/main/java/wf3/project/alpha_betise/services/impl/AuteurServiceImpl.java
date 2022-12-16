package wf3.project.alpha_betise.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import wf3.project.alpha_betise.entities.Auteur;
import wf3.project.alpha_betise.repositories.AuteurRepository;
import wf3.project.alpha_betise.services.AuteurService;

@Service
@Transactional
public class AuteurServiceImpl implements AuteurService {

	@Autowired
	private AuteurRepository auteurRepository;

	@Override
	public List<Auteur> getAll() {
		return auteurRepository.findAll();
	}

	@Override
	public Auteur get(Integer id) throws Exception {
		return auteurRepository.findById(id).orElseThrow(() -> new Exception("auteur introuvable"));
	}

	@Override
	public Auteur post(Auteur auteur) {
		return auteurRepository.save(auteur);
	}

	@Override
	public void delete(Integer id) {
		auteurRepository.deleteById(id);
	}

}
