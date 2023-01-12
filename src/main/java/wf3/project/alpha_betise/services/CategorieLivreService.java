package wf3.project.alpha_betise.services;

import java.util.List;

import wf3.project.alpha_betise.entities.CategorieLivre;

public interface CategorieLivreService {

    public List<CategorieLivre> getAll();

	public CategorieLivre get(Long id) throws Exception;

    public CategorieLivre post(CategorieLivre categorieLivre);

	public void delete(Long id);
}
