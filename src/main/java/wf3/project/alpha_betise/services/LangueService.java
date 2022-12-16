package wf3.project.alpha_betise.services;

import java.util.List;

import wf3.project.alpha_betise.entities.Langue;


public interface LangueService {

	public List<Langue> getAll();

	public Langue get(Integer id) throws Exception;

	public Langue post(Langue langue);

	public void delete(Integer id);
}
