package wf3.project.alpha_betise.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import wf3.project.alpha_betise.entities.Editeur;
import wf3.project.alpha_betise.services.EditeurService;

import java.util.List;

@RestController
@RequestMapping("/editeur")
public class EditeurController {

    @Autowired
    private EditeurService editeurService;

    @GetMapping("")
    public List<Editeur> getAll() {
        return editeurService.getAll();
    }

    @GetMapping("/{id}")
    public Editeur get(@PathVariable("id") Integer id) throws Exception {
        return editeurService.get(id);
    }

    @PostMapping
    public Editeur post(Editeur editeur) {
        return editeurService.post(editeur);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Integer id) {
        editeurService.delete(id);
    }
}
