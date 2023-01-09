package wf3.project.alpha_betise.services;

import wf3.project.alpha_betise.entities.Livre;

import java.util.List;

public interface LivreService {

    public List<Livre> getAll();

    public Livre get(Integer id) throws Exception;

    public Livre post(Livre livre);

    public void delete(Integer id);
}
