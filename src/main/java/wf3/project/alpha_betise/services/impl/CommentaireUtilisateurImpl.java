package wf3.project.alpha_betise.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import wf3.project.alpha_betise.entities.CommentaireUtilisateur;
import wf3.project.alpha_betise.repositories.CommentaireUtilisateurRepository;
import wf3.project.alpha_betise.services.CommentaireUtilisateurService;

@Service
@Transactional
public class CommentaireUtilisateurImpl implements CommentaireUtilisateurService {
	@Autowired
	private CommentaireUtilisateurRepository commentaireUtilisateurRepository;

	@Override
	public List<CommentaireUtilisateur> getAll() {
		return commentaireUtilisateurRepository.findAll();
	}

	@Override
	public CommentaireUtilisateur get(Integer id) throws Exception {
		return commentaireUtilisateurRepository.findById(id)
				.orElseThrow(() -> new Exception("Commentaire introuvable"));
	}

	@Override
	public CommentaireUtilisateur post(CommentaireUtilisateur commentaireUtilisateur) {
		return commentaireUtilisateurRepository.save(commentaireUtilisateur);
	}

	@Override
	public void delete(Integer id) {
		commentaireUtilisateurRepository.deleteById(id);
	}

}
