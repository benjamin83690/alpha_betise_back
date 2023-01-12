package wf3.project.alpha_betise.services;

import java.util.List;

import wf3.project.alpha_betise.entities.CollectionLivre;

public interface CollectionService {
	
	public List<CollectionLivre> getAll();

	public CollectionLivre get(Long id) throws Exception;

    public CollectionLivre post(CollectionLivre collection);

	public void delete(Long id);
}
