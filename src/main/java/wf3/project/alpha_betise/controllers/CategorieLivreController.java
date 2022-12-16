package wf3.project.alpha_betise.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import wf3.project.alpha_betise.entities.CategorieLivre;
import wf3.project.alpha_betise.services.CategorieLivreService;

import java.util.List;

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
    public CategorieLivre get(@PathVariable("id") Integer id) throws Exception {
        return categorieLivreService.get(id);
    }

    @PostMapping
    public CategorieLivre post(CategorieLivre categorieLivre) {
        return categorieLivreService.post(categorieLivre);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        categorieLivreService.delete(id);
    }
}
