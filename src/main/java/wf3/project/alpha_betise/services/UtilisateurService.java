package wf3.project.alpha_betise.services;

import java.util.List;

import wf3.project.alpha_betise.entities.Utilisateur;

public interface UtilisateurService {

	public List<Utilisateur> getAll();

	public Utilisateur get(Integer id) throws Exception;

	public Utilisateur post(Utilisateur utilisateur);

	public void delete(Integer id);
}
