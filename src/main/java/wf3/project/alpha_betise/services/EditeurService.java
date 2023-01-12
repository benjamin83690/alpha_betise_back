package wf3.project.alpha_betise.services;

import java.util.List;

import wf3.project.alpha_betise.entities.Editeur;

public interface EditeurService {

    public List<Editeur> getAll();

	public Editeur get(Long id) throws Exception;

    public Editeur post(Editeur editeur);

	public void delete(Long id);
}
