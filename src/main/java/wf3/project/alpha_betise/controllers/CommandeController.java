package wf3.project.alpha_betise.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import wf3.project.alpha_betise.dtos.commadeDto.CommandeDto;
import wf3.project.alpha_betise.serviceWrapper.CommandeServiceWrapper;

@RestController
@RequestMapping("/commande")
public class CommandeController {

	@Autowired
	private CommandeServiceWrapper commandeServiceWrapper;

	@GetMapping("/all")
	public List<CommandeDto> getAll() {
		return commandeServiceWrapper.getAll();
	}

	@GetMapping("/{id}")
	public CommandeDto get(@PathVariable("id") Long id) throws Exception {
		return commandeServiceWrapper.get(id);
	}

	@PostMapping
	public CommandeDto post(@RequestBody CommandeDto commande) {
		return commandeServiceWrapper.post(commande);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		commandeServiceWrapper.delete(id);
	}
}
