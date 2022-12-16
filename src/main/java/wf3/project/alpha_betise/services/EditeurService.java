package wf3.project.alpha_betise.services;

import wf3.project.alpha_betise.entities.Editeur;

import java.util.List;

public interface EditeurService {

    public List<Editeur> getAll();

    public Editeur get(Integer id) throws Exception;

    public Editeur post(Editeur editeur);

    public void delete(Integer id);
}
