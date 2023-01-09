package wf3.project.alpha_betise.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import wf3.project.alpha_betise.entities.CommentaireUtilisateur;
import wf3.project.alpha_betise.services.CommentaireUtilisateurService;

@RestController
@RequestMapping("/commentaireUtilisateur")
public class CommentaireUtilisateurController {

	@Autowired
	private CommentaireUtilisateurService commentaireUtilisateurService;

	@GetMapping("/all")
	public List<CommentaireUtilisateur> getAll() {
		return commentaireUtilisateurService.getAll();
	}

	@GetMapping("/{id}")
	public CommentaireUtilisateur get(@PathVariable("id") Integer id) throws Exception {
		return commentaireUtilisateurService.get(id);
	}

	@PostMapping
	public CommentaireUtilisateur post(CommentaireUtilisateur commentaireUtilisateur) {
		return commentaireUtilisateurService.post(commentaireUtilisateur);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Integer id) {
		commentaireUtilisateurService.delete(id);
	}
}
