package wf3.project.alpha_betise.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import wf3.project.alpha_betise.entities.EtatStock;
import wf3.project.alpha_betise.repositories.EtatStockRepository;
import wf3.project.alpha_betise.services.EtatStockService;

@Service
@Transactional
public class EtatStockServiceImpl implements EtatStockService {

	@Autowired
	public EtatStockRepository etatStockRepository;

	@Override
	public List<EtatStock> getAll() {
		return etatStockRepository.findAll();
	}

	@Override
	public EtatStock get(Long id) throws Exception {
		return etatStockRepository.findById(id).orElseThrow(() -> new Exception("Element introuvable"));
	}

	@Override
	public EtatStock post(EtatStock etatStock) {
		return etatStockRepository.save(etatStock);
	}

	@Override
	public void delete(Long id) {
		etatStockRepository.deleteById(id);
	}

}
