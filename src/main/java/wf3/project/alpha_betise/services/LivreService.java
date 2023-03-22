package wf3.project.alpha_betise.services;

import java.util.List;

import wf3.project.alpha_betise.dtos.LivreDto;

public interface LivreService {

	public List<LivreDto> getAll();

	public LivreDto get(Long id) throws Exception;

	public LivreDto post(LivreDto livre);

    public void delete(Long id);
}
