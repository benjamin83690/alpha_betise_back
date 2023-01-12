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

import wf3.project.alpha_betise.entities.Evenement;
import wf3.project.alpha_betise.services.EvenementService;

@RestController
@RequestMapping("/evenements")
public class EvenementController {

	@Autowired
	private EvenementService evenementService;

	@GetMapping("/all")
	public List<Evenement> getAll() {
		return evenementService.getAll();
	}

	@GetMapping("/{id}")
	public Evenement get(@PathVariable("id") Long id) throws Exception {
		return evenementService.get(id);
	}

	@PostMapping
	public Evenement post(@RequestBody Evenement evenement) {
		return evenementService.post(evenement);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		evenementService.delete(id);
	}
}
