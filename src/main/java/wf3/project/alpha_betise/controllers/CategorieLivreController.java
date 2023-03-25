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

import wf3.project.alpha_betise.dtos.categorieLivreDto.CategorieLivreDto;
import wf3.project.alpha_betise.serviceWrapper.CategorieServiceWrapper;

@RestController
@RequestMapping("/categorie-livre")
public class CategorieLivreController {

    @Autowired
	private CategorieServiceWrapper categorieServiceWrapper;

    @GetMapping("/all")
	public List<CategorieLivreDto> getAll() {
		return categorieServiceWrapper.getAll();
    }

    @GetMapping("/{id}")
	public CategorieLivreDto get(@PathVariable("id") Long id) throws Exception {
		return categorieServiceWrapper.get(id);
    }

    @PostMapping
	public CategorieLivreDto post(@RequestBody CategorieLivreDto categorieLivre) {
		return categorieServiceWrapper.post(categorieLivre);
    }

    @DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		categorieServiceWrapper.delete(id);
    }
}
