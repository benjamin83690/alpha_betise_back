package wf3.project.alpha_betise.services;

import java.util.List;

import wf3.project.alpha_betise.entities.EtatStock;

public interface EtatStockService {

	public List<EtatStock> getAll();

	public EtatStock get(Long id) throws Exception;

	public EtatStock post(EtatStock etatStock);

	public void delete(Long id);
}
