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

import wf3.project.alpha_betise.dtos.EditeurDto;
import wf3.project.alpha_betise.serviceWrapper.EditeurServiceWrapper;

@RestController
@RequestMapping("/editeur")
public class EditeurController {

    @Autowired
	private EditeurServiceWrapper editeurServiceWrapper;


    @GetMapping("/all")
	public List<EditeurDto> getAll() {
		return editeurServiceWrapper.getAll();
    }

    @GetMapping("/{id}")
	public EditeurDto get(@PathVariable("id") Long id) throws Exception {
		return editeurServiceWrapper.get(id);
    }

    @PostMapping
	public EditeurDto post(@RequestBody EditeurDto editeur) {
		return editeurServiceWrapper.post(editeur);
    }

    @DeleteMapping("{id}")
	public void delete(@PathVariable("id") Long id) {
		editeurServiceWrapper.delete(id);
    }
}
