package wf3.project.alpha_betise.services;

import wf3.project.alpha_betise.entities.CategorieLivre;

import java.util.List;

public interface CategorieLivreService {

    public List<CategorieLivre> getAll();

    public CategorieLivre get(Integer id) throws Exception;

    public CategorieLivre post(CategorieLivre categorieLivre);

    public void delete(Integer id);
}
