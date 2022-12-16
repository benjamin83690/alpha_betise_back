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

import wf3.project.alpha_betise.entities.EtatStock;
import wf3.project.alpha_betise.services.EtatStockService;

@RestController
@RequestMapping("/etat-stock")
public class EtatStockController {

	@Autowired
	public EtatStockService etatStockService;

	@GetMapping("/all")
	public List<EtatStock> getAll() {
		return etatStockService.getAll();
	}

	@GetMapping("/{id}")
	public EtatStock get(@PathVariable("id") Integer id) throws Exception {
		return etatStockService.get(id);
	}

	@PostMapping
	public EtatStock post(@RequestBody EtatStock etatStock) {
		return etatStockService.post(etatStock);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Integer id) {
		etatStockService.delete(id);
	}
}
