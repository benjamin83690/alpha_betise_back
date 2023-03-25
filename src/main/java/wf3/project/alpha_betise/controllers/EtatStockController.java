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

import wf3.project.alpha_betise.dtos.etatStockDto.EtatStockDto;
import wf3.project.alpha_betise.serviceWrapper.EtatStockServiceWrapper;

@RestController
@RequestMapping("/etat-stock")
public class EtatStockController {

	@Autowired
	public EtatStockServiceWrapper etatStockServiceWrapper;

	@GetMapping("/all")
	public List<EtatStockDto> getAll() {
		return etatStockServiceWrapper.getAll();
	}

	@GetMapping("/{id}")
	public EtatStockDto get(@PathVariable("id") Long id) throws Exception {
		return etatStockServiceWrapper.get(id);
	}

	@PostMapping
	public EtatStockDto post(@RequestBody EtatStockDto etatStock) {
		return etatStockServiceWrapper.post(etatStock);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		etatStockServiceWrapper.delete(id);
	}
}
