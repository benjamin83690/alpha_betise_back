package wf3.project.alpha_betise.services;

import java.util.List;

import wf3.project.alpha_betise.dtos.AuteurDto;

public interface AuteurService {

	public List<AuteurDto> getAll();

	public AuteurDto get(Long id) throws Exception;

	public AuteurDto post(AuteurDto auteur);

	public void delete(Long id);
}
