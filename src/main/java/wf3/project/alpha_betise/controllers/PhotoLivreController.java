package wf3.project.alpha_betise.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import wf3.project.alpha_betise.entities.PhotoLivre;
import wf3.project.alpha_betise.services.PhotoLivreService;

@RestController
@RequestMapping("/photos-livre")
public class PhotoLivreController {

	@Autowired
	private PhotoLivreService photoLivreService;

	@GetMapping("/all")
	public List<PhotoLivre> getAll() {
		return photoLivreService.getAll();
	}

	@GetMapping("/{id}")
	public PhotoLivre get(@PathVariable("id") Integer id) throws Exception {
		return photoLivreService.get(id);
	}

	@PostMapping
	public PhotoLivre post(PhotoLivre photoLivre) {
		return photoLivreService.post(photoLivre);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Integer id) {
		photoLivreService.delete(id);
	}
}
