package wf3.project.alpha_betise.serviceWrapper.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import wf3.project.alpha_betise.dtos.auteurDto.AuteurDto;
import wf3.project.alpha_betise.mappers.AuteurMapper;
import wf3.project.alpha_betise.serviceWrapper.AuteurServiceWrapper;
import wf3.project.alpha_betise.services.AuteurService;

@Component
@Transactional
public class AuteurServiceWrapperImpl implements AuteurServiceWrapper {

	@Autowired
	private AuteurService auteurService;

	@Autowired
	private AuteurMapper auteurMapper;

	@Override
	public List<AuteurDto> getAll() {
		return auteurMapper.toDtos(auteurService.getAll());
	}

	@Override
	public AuteurDto get(Long id) throws Exception {
		return auteurMapper.toDto(auteurService.get(id));
	}

	@Override
	public AuteurDto post(AuteurDto auteur) {
		return auteurMapper.toDto(auteurService.post(auteurMapper.toEntity(auteur)));
	}

	@Override
	public void delete(Long id) {
		auteurService.delete(id);
	}

}
