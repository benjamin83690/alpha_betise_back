package wf3.project.alpha_betise.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import wf3.project.alpha_betise.entities.CategorieLivre;
import wf3.project.alpha_betise.repositories.CategorieLivreRepository;
import wf3.project.alpha_betise.services.CategorieLivreService;

@Service
@Transactional
public class CategorieLivreServiceImpl implements CategorieLivreService {

    @Autowired
    private CategorieLivreRepository categorieLivreRepository;

    @Override
    public List<CategorieLivre> getAll() {
        return categorieLivreRepository.findAll();
    }

    @Override
	public CategorieLivre get(Long id) throws Exception {
        return categorieLivreRepository.findById(id).orElseThrow(() -> new Exception("Catégorie livre introuvable"));
    }

    @Override
    public CategorieLivre post(CategorieLivre categorieLivre) {
        return categorieLivreRepository.save(categorieLivre);
    }

    @Override
	public void delete(Long id) {
        categorieLivreRepository.deleteById(id);
    }
}
