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

import wf3.project.alpha_betise.entities.Utilisateur;
import wf3.project.alpha_betise.services.UtilisateurService;

@RestController
@RequestMapping("/utilisateur")
public class UtilisateurController {

	@Autowired
	private UtilisateurService utilisateurService;

	@GetMapping("/all")
	public List<Utilisateur> getAll() {
		return utilisateurService.getAll();
	}

	@GetMapping("/{id}")
	public Utilisateur get(@PathVariable("id") Long id) throws Exception {
		return utilisateurService.get(id);
	}

	@PostMapping
	public Utilisateur post(@RequestBody Utilisateur utilisateur) {
		return utilisateurService.post(utilisateur);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		utilisateurService.delete(id);
	}
}
