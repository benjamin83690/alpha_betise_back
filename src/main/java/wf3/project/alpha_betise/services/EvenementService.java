package wf3.project.alpha_betise.services;

import java.util.List;

import wf3.project.alpha_betise.entities.Evenement;

public interface EvenementService {

	public List<Evenement> getAll();

	public Evenement get(Integer id) throws Exception;

	public Evenement post(Evenement evenement);

	public void delete(Integer id);
}
