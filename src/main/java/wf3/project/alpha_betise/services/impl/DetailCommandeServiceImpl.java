package wf3.project.alpha_betise.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import wf3.project.alpha_betise.entities.DetailCommande;
import wf3.project.alpha_betise.repositories.DetailCommandeRepository;
import wf3.project.alpha_betise.services.DetailCommandeService;

@Service
@Transactional
public class DetailCommandeServiceImpl implements DetailCommandeService {

	@Autowired
	private DetailCommandeRepository detailCommandeRepository;

	@Override
	public List<DetailCommande> getAll() {
		return detailCommandeRepository.findAll();
	}

	@Override
	public DetailCommande get(Integer id) throws Exception {
		return detailCommandeRepository.findById(id).orElseThrow(() -> new Exception("commande introuvable"));
	}

	@Override
	public DetailCommande post(DetailCommande detailCommande) {
		return detailCommandeRepository.save(detailCommande);
	}

	@Override
	public void delete(Integer id) {
		detailCommandeRepository.deleteById(id);
	}

}