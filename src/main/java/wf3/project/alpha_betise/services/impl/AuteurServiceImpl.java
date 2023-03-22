package wf3.project.alpha_betise.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import wf3.project.alpha_betise.dtos.AuteurDto;
import wf3.project.alpha_betise.mappers.AuteurMapper;
import wf3.project.alpha_betise.repositories.AuteurRepository;
import wf3.project.alpha_betise.services.AuteurService;

@Service
@Transactional
public class AuteurServiceImpl implements AuteurService {

	@Autowired
	private AuteurRepository auteurRepository;

	@Autowired
	private AuteurMapper auteurMapper;

	@Override
	public List<AuteurDto> getAll() {
		return auteurMapper.toDtos(auteurRepository.findAll());
	}

	@Override
	public AuteurDto get(Long id) throws Exception {
		return auteurMapper.toDto(auteurRepository.findById(id).orElseThrow(() -> new Exception("auteur introuvable")));
	}

	@Override
	public AuteurDto post(AuteurDto auteur) {
		return auteurMapper.toDto(auteurRepository.save(auteurMapper.toEntity(auteur)));
	}

	@Override
	public void delete(Long id) {
		auteurRepository.deleteById(id);
	}

}
