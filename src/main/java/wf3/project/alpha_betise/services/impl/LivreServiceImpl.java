package wf3.project.alpha_betise.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wf3.project.alpha_betise.entities.Livre;
import wf3.project.alpha_betise.repositories.LivreRepository;
import wf3.project.alpha_betise.services.LivreService;

import java.util.List;

@Service
@Transactional
public class LivreServiceImpl implements LivreService {

    @Autowired
    private LivreRepository livreRepository;

    @Override
    public List<Livre> getAll() {
        return livreRepository.findAll();
    }

    @Override
    public Livre get(Integer id) throws Exception {
        return livreRepository.findById(id).orElseThrow(() -> new Exception("Livre introuvable"));
    }

    @Override
    public Livre post(Livre livre) {
        return livreRepository.save(livre);
    }

    @Override
    public void delete(Integer id) {
        livreRepository.deleteById(id);
    }
}
