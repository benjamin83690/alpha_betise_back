package wf3.project.alpha_betise.services;

import java.util.List;

import wf3.project.alpha_betise.dtos.UtilisateurDto;
import wf3.project.alpha_betise.entities.Utilisateur;

public interface UtilisateurService {

	public List<Utilisateur> getAll();

	public UtilisateurDto get(String email) throws Exception;

	public Utilisateur post(Utilisateur utilisateur);

	public void delete(Long id);

	public String signUpUser(Utilisateur utilisateur);

	public int enableAppUser(String email);
}
