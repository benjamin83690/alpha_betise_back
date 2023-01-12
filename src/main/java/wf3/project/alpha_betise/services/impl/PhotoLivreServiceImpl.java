package wf3.project.alpha_betise.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import wf3.project.alpha_betise.entities.PhotoLivre;
import wf3.project.alpha_betise.repositories.PhotoLivreRepository;
import wf3.project.alpha_betise.services.PhotoLivreService;

@Transactional
@Service
public class PhotoLivreServiceImpl implements PhotoLivreService {

	@Autowired
	private PhotoLivreRepository photoLivreRepository;

	@Override
	public List<PhotoLivre> getAll() {
		return photoLivreRepository.findAll();
	}

	@Override
	public PhotoLivre get(Long id) throws Exception {
		return photoLivreRepository.findById(id).orElseThrow(() -> new Exception("Photo livre introuvable"));
	}

	@Override
	public PhotoLivre post(PhotoLivre photoLivre) {
		return photoLivreRepository.save(photoLivre);
	}

	@Override
	public void delete(Long id) {
		photoLivreRepository.deleteById(id);
	}

}
