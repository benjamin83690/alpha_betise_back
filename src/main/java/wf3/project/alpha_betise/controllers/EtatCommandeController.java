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

import wf3.project.alpha_betise.entities.EtatCommande;
import wf3.project.alpha_betise.services.EtatCommandeService;

@RestController
@RequestMapping("/etats-commandes")
public class EtatCommandeController {

	@Autowired
	private EtatCommandeService etatCommandeService;

	@GetMapping("/all")
	public List<EtatCommande> getAll() {
		return etatCommandeService.getAll();
	}

	@GetMapping("/{id}")
	public EtatCommande get(@PathVariable("id") Long id) throws Exception {
		return etatCommandeService.get(id);
	}

	@PostMapping
	public EtatCommande post(@RequestBody EtatCommande etatCommande) {
		return etatCommandeService.post(etatCommande);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		etatCommandeService.delete(id);
	}
}
