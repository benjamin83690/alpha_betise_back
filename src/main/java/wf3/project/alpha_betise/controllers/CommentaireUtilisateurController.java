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

import wf3.project.alpha_betise.entities.CommentaireUtilisateur;
import wf3.project.alpha_betise.services.CommentaireUtilisateurService;

@RestController
@RequestMapping("/commentaires-utilisateur")
public class CommentaireUtilisateurController {

	@Autowired
	private CommentaireUtilisateurService commentaireUtilisateurService;

	@GetMapping("/all")
	public List<CommentaireUtilisateur> getAll() {
		return commentaireUtilisateurService.getAll();
	}

	@GetMapping("/{id}")
	public CommentaireUtilisateur get(@PathVariable("id") Long id) throws Exception {
		return commentaireUtilisateurService.get(id);
	}

	@PostMapping
	public CommentaireUtilisateur post(@RequestBody CommentaireUtilisateur commentaireUtilisateur) {
		return commentaireUtilisateurService.post(commentaireUtilisateur);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		commentaireUtilisateurService.delete(id);
	}
}
