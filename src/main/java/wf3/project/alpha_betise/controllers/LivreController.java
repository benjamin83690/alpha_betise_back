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

import wf3.project.alpha_betise.dtos.LivreDto;
import wf3.project.alpha_betise.services.LivreService;

@RestController
@RequestMapping("/livre")
public class LivreController {

    @Autowired
    private LivreService livreService;

    @GetMapping("/all")
	public List<LivreDto> getAll() {
        return livreService.getAll();
    }

    @GetMapping("/{id}")
	public LivreDto get(@PathVariable("id") Long id) throws Exception {
        return livreService.get(id);
    }

    @PostMapping
	public LivreDto post(@RequestBody LivreDto livre) {
        return livreService.post(livre);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        livreService.delete(id);
    }
}
