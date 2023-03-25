package wf3.project.alpha_betise.serviceWrapper;

import java.util.List;

import wf3.project.alpha_betise.dtos.auteurDto.AuteurDto;

public interface AuteurServiceWrapper {

	public List<AuteurDto> getAll();

	public AuteurDto get(Long id) throws Exception;

	public AuteurDto post(AuteurDto auteur);

	public void delete(Long id);
}
