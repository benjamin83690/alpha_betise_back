package wf3.project.alpha_betise.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import wf3.project.alpha_betise.entities.Collection;
import wf3.project.alpha_betise.repositories.CollectionRepository;
import wf3.project.alpha_betise.services.CollectionService;

@Service
@Transactional
public class CollectionServiceImpl implements CollectionService {
	@Autowired
	CollectionRepository collectionRepository;
	
	@Override
    public List<Collection> getAll() {
        return collectionRepository.findAll();
    }

    @Override
	public Collection get(Long id) throws Exception {
        return collectionRepository.findById(id).orElseThrow(() -> new Exception("Collection introuvable"));
    }

    @Override
    public Collection post(Collection collection) {
        return collectionRepository.save(collection);
    }

    @Override
	public void delete(Long id) {
    	collectionRepository.deleteById(id);
    }
}
