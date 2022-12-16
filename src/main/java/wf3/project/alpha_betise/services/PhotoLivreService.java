package wf3.project.alpha_betise.services;

import java.util.List;

import wf3.project.alpha_betise.entities.PhotoLivre;

public interface PhotoLivreService {

	public List<PhotoLivre> getAll();

	public PhotoLivre get(Integer id) throws Exception;

	public PhotoLivre post(PhotoLivre photoLivre);

	public void delete(Integer id);
}
