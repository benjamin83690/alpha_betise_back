package wf3.project.alpha_betise.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import wf3.project.alpha_betise.entities.Editeur;
import wf3.project.alpha_betise.repositories.EditeurRepository;
import wf3.project.alpha_betise.services.EditeurService;

@Service
@Transactional
public class EditeurServiceImpl implements EditeurService {

	@Autowired
	private EditeurRepository editeurRepository;

    @Override
    public List<Editeur> getAll() {
        return editeurRepository.findAll();
    }

    @Override
	public Editeur get(Long id) throws Exception {
        return editeurRepository.findById(id).orElseThrow(() -> new Exception("Editeur introuvable"));
    }

    @Override
    public Editeur post(Editeur editeur) {
        return editeurRepository.save(editeur);
    }

    @Override
	public void delete(Long id) {
        editeurRepository.deleteById(id);
    }
}
