package wf3.project.alpha_betise.services;

import java.util.List;

import wf3.project.alpha_betise.entities.EtatCommande;

public interface EtatCommandeService {

	public List<EtatCommande> getAll();

	public EtatCommande get(Integer id) throws Exception;

	public EtatCommande post(EtatCommande etatCommande);

	public void delete(Integer id);
}