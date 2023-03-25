package wf3.project.alpha_betise.serviceWrapper;

import java.util.List;

import wf3.project.alpha_betise.dtos.langueDto.LangueDto;

public interface LangueServiceWrapper {

	public List<LangueDto> getAll();

	public LangueDto get(Long id) throws Exception;

	public LangueDto post(LangueDto langue);

	public void delete(Long id);
}
