package wf3.project.alpha_betise.services;

import java.util.List;

import wf3.project.alpha_betise.entities.Auteur;

public interface AuteurService {

	public List<Auteur> getAll();

	public Auteur get(Long id) throws Exception;

	public Auteur post(Auteur auteur);

	public void delete(Long id);
}
