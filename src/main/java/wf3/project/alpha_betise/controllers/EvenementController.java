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

import wf3.project.alpha_betise.dtos.EvenementDto;
import wf3.project.alpha_betise.serviceWrapper.EvenementServiceWrapper;

@RestController
@RequestMapping("/evenements")
public class EvenementController {

	@Autowired
	private EvenementServiceWrapper evenementServiceWrapper;

	@GetMapping("/all")
	public List<EvenementDto> getAll() {
		return evenementServiceWrapper.getAll();
	}

	@GetMapping("/{id}")
	public EvenementDto get(@PathVariable("id") Long id) throws Exception {
		return evenementServiceWrapper.get(id);
	}

	@PostMapping
	public EvenementDto post(@RequestBody EvenementDto evenement) {
		return evenementServiceWrapper.post(evenement);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		evenementServiceWrapper.delete(id);
	}

	@GetMapping("/next-event")
	public List<EvenementDto> getNextEvent() {
		return evenementServiceWrapper.getNextEvent();
	}

	@GetMapping("/past-event")
	public List<EvenementDto> getPastEvent() {
		return evenementServiceWrapper.getPastEvent();
	}
}
