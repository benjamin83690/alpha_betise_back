package wf3.project.alpha_betise.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import wf3.project.alpha_betise.entities.Livre;
import wf3.project.alpha_betise.services.LivreService;

import java.util.List;

@RestController
@RequestMapping("/livre")
public class LivreController {

    @Autowired
    private LivreService livreService;

    @GetMapping("/all")
    public List<Livre> getAll() {
        return livreService.getAll();
    }

    @GetMapping("/{id}")
    public Livre get(@PathVariable("id") Integer id) throws Exception {
        return livreService.get(id);
    }

    @PostMapping
    public Livre post(Livre livre) {
        return livreService.post(livre);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        livreService.delete(id);
    }
}
