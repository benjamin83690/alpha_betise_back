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

import wf3.project.alpha_betise.dtos.etatCommandeDto.EtatCommandeDto;
import wf3.project.alpha_betise.serviceWrapper.EtatCommandeServiceWrapper;

@RestController
@RequestMapping("/etats-commandes")
public class EtatCommandeController {

	@Autowired
	private EtatCommandeServiceWrapper etatCommandeServiceWrapper;

	@GetMapping("/all")
	public List<EtatCommandeDto> getAll() {
		return etatCommandeServiceWrapper.getAll();
	}

	@GetMapping("/{id}")
	public EtatCommandeDto get(@PathVariable("id") Long id) throws Exception {
		return etatCommandeServiceWrapper.get(id);
	}

	@PostMapping
	public EtatCommandeDto post(@RequestBody EtatCommandeDto etatCommande) {
		return etatCommandeServiceWrapper.post(etatCommande);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		etatCommandeServiceWrapper.delete(id);
	}
}
