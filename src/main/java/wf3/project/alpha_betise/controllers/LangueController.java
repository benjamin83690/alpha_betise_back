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

import wf3.project.alpha_betise.entities.Langue;
import wf3.project.alpha_betise.services.LangueService;

@RestController
@RequestMapping("/langue")
public class LangueController {

	@Autowired
	public LangueService langueService;

	@GetMapping("/all")
	public List<Langue> getAll() {
		return langueService.getAll();
	}

	@GetMapping("/{id}")
	public Langue get(@PathVariable("id") Integer id) throws Exception {
		return langueService.get(id);
	}
	
	@PostMapping
	public Langue post(@RequestBody Langue langue) {
		return langueService.post(langue);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Integer id) {
		langueService.delete(id);
	}
}
