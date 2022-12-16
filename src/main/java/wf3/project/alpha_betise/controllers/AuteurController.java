package wf3.project.alpha_betise.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import wf3.project.alpha_betise.entities.Auteur;
import wf3.project.alpha_betise.services.AuteurService;

@RestController
@RequestMapping("/auteur")
public class AuteurController {

	@Autowired
	private AuteurService auteurService;

	@GetMapping("/all")
	public List<Auteur> getAll() {
		return auteurService.getAll();
	}

	@GetMapping("/{id}")
	public Auteur get(@PathVariable("id") Integer id) throws Exception {
		return auteurService.get(id);
	}

	@PostMapping
	public Auteur post(Auteur auteur) {
		return auteurService.post(auteur);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Integer id) {
		auteurService.delete(id);
	}
}
