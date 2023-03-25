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

import wf3.project.alpha_betise.dtos.DetailCommandeDto;
import wf3.project.alpha_betise.serviceWrapper.DetailCommandeServiceWrapper;

@RestController
@RequestMapping("/detailCommande")
public class DetailCommandeController {

	@Autowired
	private DetailCommandeServiceWrapper detailCommandeServiceWrapper;

	@GetMapping("/all")
	public List<DetailCommandeDto> getAll() {
		return detailCommandeServiceWrapper.getAll();
	}

	@GetMapping("/{id}")
	public DetailCommandeDto get(@PathVariable("id") Long id) throws Exception {
		return detailCommandeServiceWrapper.get(id);
	}

	@PostMapping
	public DetailCommandeDto post(@RequestBody DetailCommandeDto detailCommande) {
		return detailCommandeServiceWrapper.post(detailCommande);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		detailCommandeServiceWrapper.delete(id);
	}
}