package wf3.project.alpha_betise.serviceWrapper.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import wf3.project.alpha_betise.dtos.commadeDto.CommandeDto;
import wf3.project.alpha_betise.mappers.CommandeMapper;
import wf3.project.alpha_betise.serviceWrapper.CommandeServiceWrapper;
import wf3.project.alpha_betise.services.CommandeService;

@Component
@Transactional
public class CommandeServiceWrapperImpl implements CommandeServiceWrapper {

	@Autowired
	private CommandeService commandeService;

	@Autowired
	private CommandeMapper commandeMapper;

	@Override
	public List<CommandeDto> getAll() {
		return commandeMapper.toDtos(commandeService.getAll());
	}

	@Override
	public CommandeDto get(Long id) throws Exception {
		return commandeMapper.toDto(commandeService.get(id));
	}

	@Override
	public CommandeDto post(CommandeDto commande) {
		return commandeMapper.toDto(commandeService.post(commandeMapper.toEntity(commande)));
	}

	@Override
	public void delete(Long id) {
		commandeService.delete(id);
	}

}
