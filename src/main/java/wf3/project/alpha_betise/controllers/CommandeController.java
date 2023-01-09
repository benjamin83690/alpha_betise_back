package wf3.project.alpha_betise.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import wf3.project.alpha_betise.entities.Commande;
import wf3.project.alpha_betise.services.CommandeService;

@RestController
@RequestMapping("/commande")
public class CommandeController {

	@Autowired
	private CommandeService commandeService;

	@GetMapping("/all")
	public List<Commande> getAll() {
		return commandeService.getAll();
	}

	@GetMapping("/{id}")
	public Commande get(@PathVariable("id") Integer id) throws Exception {
		return commandeService.get(id);
	}

	@PostMapping
	public Commande post(Commande commande) {
		return commandeService.post(commande);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Integer id) {
		commandeService.delete(id);
	}
}
