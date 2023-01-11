package wf3.project.alpha_betise.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import wf3.project.alpha_betise.entities.EtatCommande;
import wf3.project.alpha_betise.repositories.EtatCommandeRepository;
import wf3.project.alpha_betise.services.EtatCommandeService;

@Service
@Transactional
public class EtatCommandeServiceImpl implements EtatCommandeService {

	@Autowired
	private EtatCommandeRepository etatCommandeRepository;

	@Override
	public List<EtatCommande> getAll() {
		return etatCommandeRepository.findAll();
	}

	@Override
	public EtatCommande get(Integer id) throws Exception {
		return etatCommandeRepository.findById(id).orElseThrow(() -> new Exception("Etat de la commande introuvable."));
	}

	@Override
	public EtatCommande post(EtatCommande etatCommande) {
		return etatCommandeRepository.save(etatCommande);
	}

	@Override
	public void delete(Integer id) {
		etatCommandeRepository.deleteById(id);
	}

}
