package wf3.project.alpha_betise.serviceWrapper.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import wf3.project.alpha_betise.dtos.categorieLivreDto.CategorieLivreDto;
import wf3.project.alpha_betise.mappers.CategorieMapper;
import wf3.project.alpha_betise.serviceWrapper.CategorieServiceWrapper;
import wf3.project.alpha_betise.services.CategorieLivreService;

@Component
@Transactional
public class CategorieServiceWrapperImpl implements CategorieServiceWrapper {

	@Autowired
	private CategorieLivreService categorieLivreService;

	@Autowired
	private CategorieMapper categorieMapper;

	@Override
	public List<CategorieLivreDto> getAll() {
		return categorieMapper.toDtos(categorieLivreService.getAll());
	}

	@Override
	public CategorieLivreDto get(Long id) throws Exception {
		return categorieMapper.toDto(categorieLivreService.get(id));
	}

	@Override
	public CategorieLivreDto post(CategorieLivreDto categorieLivre) {
		return categorieMapper.toDto(categorieLivreService.post(categorieMapper.toEntity(categorieLivre)));
	}

	@Override
	public void delete(Long id) {
		categorieLivreService.delete(id);
	}

}
