package wf3.project.alpha_betise.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import wf3.project.alpha_betise.entities.Commande;
import wf3.project.alpha_betise.repositories.CommandeRepository;
import wf3.project.alpha_betise.services.CommandeService;

@Service
@Transactional
public class CommandeServiceImpl implements CommandeService {

	@Autowired
	private CommandeRepository commandeRepository;

	@Override
	public List<Commande> getAll() {
		return commandeRepository.findAll();
	}

	@Override
	public Commande get(Integer id) throws Exception {
		return commandeRepository.findById(id).orElseThrow(() -> new Exception("Commande Introuvable"));
	}

	@Override
	public Commande post(Commande commande) {
		return commandeRepository.save(commande);
	}

	@Override
	public void delete(Integer id) {
		commandeRepository.deleteById(id);
	}

}
