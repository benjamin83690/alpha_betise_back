package wf3.project.alpha_betise.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import wf3.project.alpha_betise.entities.Editeur;
import wf3.project.alpha_betise.services.EditeurService;

@RestController
@RequestMapping("/editeur")
public class EditeurController {

    @Autowired
    private EditeurService editeurService;


    @GetMapping("/all")
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
