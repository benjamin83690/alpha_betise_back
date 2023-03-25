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

import wf3.project.alpha_betise.dtos.utilisateurDto.UtilisateurDto;
import wf3.project.alpha_betise.serviceWrapper.UtilisateurServiceWrapper;

@RestController
@RequestMapping("/utilisateur")
public class UtilisateurController {

	@Autowired
	private UtilisateurServiceWrapper utilisateurServiceWrapper;

	@GetMapping("/all")
	public List<UtilisateurDto> getAll() {
		return utilisateurServiceWrapper.getAll();
	}

	@GetMapping("/{email}")
	public UtilisateurDto get(@PathVariable("email") String email) throws Exception {
		return utilisateurServiceWrapper.get(email);
	}

	@PostMapping
	public UtilisateurDto post(@RequestBody UtilisateurDto utilisateur) {
		return utilisateurServiceWrapper.post(utilisateur);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		utilisateurServiceWrapper.delete(id);
	}
}
