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

import wf3.project.alpha_betise.dtos.collectionDto.CollectionDto;
import wf3.project.alpha_betise.serviceWrapper.CollectionServiceWrapper;

@RestController
@RequestMapping("/collection")
public class CollectionController {
	@Autowired
	private CollectionServiceWrapper collectionServiceWrapper;

	@GetMapping("/all")
	public List<CollectionDto> getAll() {
		return collectionServiceWrapper.getAll();
	}

	@GetMapping("/{id}")
	public CollectionDto get(@PathVariable("id") Long id) throws Exception {
		return collectionServiceWrapper.get(id);
	}

	@PostMapping
	public CollectionDto post(@RequestBody CollectionDto collection) {
		return collectionServiceWrapper.post(collection);
	}

	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Long id) {
		collectionServiceWrapper.delete(id);
	}
}
