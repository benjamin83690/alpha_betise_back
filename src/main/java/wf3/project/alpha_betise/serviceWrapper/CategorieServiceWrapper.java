package wf3.project.alpha_betise.serviceWrapper;

import java.util.List;

import wf3.project.alpha_betise.dtos.categorieLivreDto.CategorieLivreDto;

public interface CategorieServiceWrapper {

	public List<CategorieLivreDto> getAll();

	public CategorieLivreDto get(Long id) throws Exception;

	public CategorieLivreDto post(CategorieLivreDto categorieLivre);

	public void delete(Long id);
}
