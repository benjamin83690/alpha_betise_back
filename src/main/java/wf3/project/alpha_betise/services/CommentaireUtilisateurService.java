package wf3.project.alpha_betise.services;

import java.util.List;

import wf3.project.alpha_betise.entities.CommentaireUtilisateur;

public interface CommentaireUtilisateurService {

	public List<CommentaireUtilisateur> getAll();

	public CommentaireUtilisateur get(Long id) throws Exception;

	public CommentaireUtilisateur post(CommentaireUtilisateur commentaireUtilisateur);

	public void delete(Long id);
}
