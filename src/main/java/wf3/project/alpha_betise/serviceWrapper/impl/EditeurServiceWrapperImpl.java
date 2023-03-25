package wf3.project.alpha_betise.serviceWrapper.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import wf3.project.alpha_betise.dtos.EditeurDto;
import wf3.project.alpha_betise.mappers.EditeurMapper;
import wf3.project.alpha_betise.serviceWrapper.EditeurServiceWrapper;
import wf3.project.alpha_betise.services.EditeurService;

@Component
@Transactional
public class EditeurServiceWrapperImpl implements EditeurServiceWrapper {

	@Autowired
	private EditeurService editeurService;

	@Autowired
	private EditeurMapper editeurMapper;

	@Override
	public List<EditeurDto> getAll() {
		return editeurMapper.toDtos(editeurService.getAll());
	}

	@Override
	public EditeurDto get(Long id) throws Exception {
		return editeurMapper.toDto(editeurService.get(id));
	}

	@Override
	public EditeurDto post(EditeurDto editeur) {
		return editeurMapper.toDto(editeurService.post(editeurMapper.toEntity(editeur)));
	}

	@Override
	public void delete(Long id) {
		editeurService.delete(id);
	}

}
