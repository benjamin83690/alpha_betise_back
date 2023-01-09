package wf3.project.alpha_betise.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import wf3.project.alpha_betise.entities.CollectionLivre;
import wf3.project.alpha_betise.services.CollectionService;

@RestController
@RequestMapping("/collection")
public class CollectionController {
	@Autowired
	private CollectionService collectionService;

	@GetMapping("/all")
	public List<CollectionLivre> getAll() {
		return collectionService.getAll();
	}

	@GetMapping("/{id}")
	public CollectionLivre get(@PathVariable("id") Integer id) throws Exception {
		return collectionService.get(id);
	}

	@PostMapping
	public CollectionLivre post(CollectionLivre collection) {
		return collectionService.post(collection);
	}

	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Integer id) {
		collectionService.delete(id);
	}
}
