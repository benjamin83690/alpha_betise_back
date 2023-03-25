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

import wf3.project.alpha_betise.dtos.langueDto.LangueDto;
import wf3.project.alpha_betise.serviceWrapper.LangueServiceWrapper;

@RestController
@RequestMapping("/langue")
public class LangueController {

	@Autowired
	public LangueServiceWrapper langueServiceWrapper;

	@GetMapping("/all")
	public List<LangueDto> getAll() {
		return langueServiceWrapper.getAll();
	}

	@GetMapping("/{id}")
	public LangueDto get(@PathVariable("id") Long id) throws Exception {
		return langueServiceWrapper.get(id);
	}
	
	@PostMapping
	public LangueDto post(@RequestBody LangueDto langue) {
		return langueServiceWrapper.post(langue);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		langueServiceWrapper.delete(id);
	}
}
