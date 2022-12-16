package wf3.project.alpha_betise.services;

import java.util.List;

import wf3.project.alpha_betise.entities.Collection;

public interface CollectionService {
	
	public List<Collection> getAll();

    public Collection get(Integer id) throws Exception;

    public Collection post(Collection collection);

    public void delete(Integer id);
}
