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

import wf3.project.alpha_betise.entities.CategorieLivre;
import wf3.project.alpha_betise.services.CategorieLivreService;

@RestController
@RequestMapping("/categorie-livre")
public class CategorieLivreController {

    @Autowired
    private CategorieLivreService categorieLivreService;

    @GetMapping("/all")
    public List<CategorieLivre> getAll() {
        return categorieLivreService.getAll();
    }

    @GetMapping("/{id}")
	public CategorieLivre get(@PathVariable("id") Long id) throws Exception {
        return categorieLivreService.get(id);
    }

    @PostMapping
	public CategorieLivre post(@RequestBody CategorieLivre categorieLivre) {
        return categorieLivreService.post(categorieLivre);
    }

    @DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
        categorieLivreService.delete(id);
    }
}
