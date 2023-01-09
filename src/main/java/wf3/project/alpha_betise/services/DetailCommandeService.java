package wf3.project.alpha_betise.services;

import java.util.List;

import wf3.project.alpha_betise.entities.DetailCommande;

public interface DetailCommandeService {

	public List<DetailCommande> getAll();

	public DetailCommande get(Integer id) throws Exception;

	public DetailCommande post(DetailCommande detailCommande);

	public void delete(Integer id);
}
