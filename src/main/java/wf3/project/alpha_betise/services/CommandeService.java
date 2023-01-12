package wf3.project.alpha_betise.services;

import java.util.List;

import wf3.project.alpha_betise.entities.Commande;

public interface CommandeService {

	public List<Commande> getAll();

	public Commande get(Long id) throws Exception;

	public Commande post(Commande commande);

	public void delete(Long id);
}
