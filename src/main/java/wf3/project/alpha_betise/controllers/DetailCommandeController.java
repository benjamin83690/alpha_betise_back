package wf3.project.alpha_betise.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import wf3.project.alpha_betise.entities.DetailCommande;
import wf3.project.alpha_betise.services.DetailCommandeService;

@RestController
@RequestMapping("/detailCommande")
public class DetailCommandeController {

	@Autowired
	private DetailCommandeService detailCommandeService;

	@GetMapping("/all")
	public List<DetailCommande> getAll() {
		return detailCommandeService.getAll();
	}

	@GetMapping("/{id}")
	public DetailCommande get(@PathVariable("id") Integer id) throws Exception {
		return detailCommandeService.get(id);
	}

	@PostMapping
	public DetailCommande post(DetailCommande detailCommande) {
		return detailCommandeService.post(detailCommande);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Integer id) {
		detailCommandeService.delete(id);
	}
}