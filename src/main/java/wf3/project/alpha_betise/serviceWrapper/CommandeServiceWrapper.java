package wf3.project.alpha_betise.serviceWrapper;

import java.util.List;

import wf3.project.alpha_betise.dtos.commadeDto.CommandeDto;

public interface CommandeServiceWrapper {

	public List<CommandeDto> getAll();

	public CommandeDto get(Long id) throws Exception;

	public CommandeDto post(CommandeDto commande);

	public void delete(Long id);
}
