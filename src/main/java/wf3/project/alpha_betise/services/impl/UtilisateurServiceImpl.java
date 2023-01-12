package wf3.project.alpha_betise.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import wf3.project.alpha_betise.entities.Utilisateur;
import wf3.project.alpha_betise.repositories.UtilisateurRepository;
import wf3.project.alpha_betise.services.UtilisateurService;

@Service
@Transactional
public class UtilisateurServiceImpl implements UtilisateurService {

	@Autowired
	private UtilisateurRepository utilisateurRepository;

	@Override
	public List<Utilisateur> getAll() {
		return utilisateurRepository.findAll();
	}

	@Override
	public Utilisateur get(Long id) throws Exception {
		return utilisateurRepository.findById(id).orElseThrow(() -> new Exception("Utilisateur introuvable"));
	}

	@Override
	public Utilisateur post(Utilisateur utilisateur) {
		return utilisateurRepository.save(utilisateur);
	}

	@Override
	public void delete(Long id) {
		utilisateurRepository.deleteById(id);
	}

}
