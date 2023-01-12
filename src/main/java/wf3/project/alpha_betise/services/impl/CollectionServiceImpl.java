package wf3.project.alpha_betise.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import wf3.project.alpha_betise.entities.CollectionLivre;
import wf3.project.alpha_betise.repositories.CollectionRepository;
import wf3.project.alpha_betise.services.CollectionService;

@Service
@Transactional
public class CollectionServiceImpl implements CollectionService {
	@Autowired
	CollectionRepository collectionRepository;
	
	@Override
    public List<CollectionLivre> getAll() {
        return collectionRepository.findAll();
    }

    @Override
	public CollectionLivre get(Long id) throws Exception {
        return collectionRepository.findById(id).orElseThrow(() -> new Exception("Collection introuvable"));
    }

    @Override
    public CollectionLivre post(CollectionLivre collection) {
        return collectionRepository.save(collection);
    }

    @Override
	public void delete(Long id) {
    	collectionRepository.deleteById(id);
    }
}
