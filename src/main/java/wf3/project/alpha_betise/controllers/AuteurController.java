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

import wf3.project.alpha_betise.dtos.auteurDto.AuteurDto;
import wf3.project.alpha_betise.serviceWrapper.AuteurServiceWrapper;

@RestController
@RequestMapping("/auteur")
public class AuteurController {

	@Autowired
	private AuteurServiceWrapper auteurServiceWrapper;

	@GetMapping("/all")
	public List<AuteurDto> getAll() {
		return auteurServiceWrapper.getAll();
	}

	@GetMapping("/{id}")
	public AuteurDto get(@PathVariable("id") Long id) throws Exception {
		return auteurServiceWrapper.get(id);
	}

	@PostMapping
	public AuteurDto post(@RequestBody AuteurDto auteur) {
		return auteurServiceWrapper.post(auteur);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		auteurServiceWrapper.delete(id);
	}
}
