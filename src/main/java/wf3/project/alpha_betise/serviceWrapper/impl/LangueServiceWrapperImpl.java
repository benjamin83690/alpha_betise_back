package wf3.project.alpha_betise.serviceWrapper.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import wf3.project.alpha_betise.dtos.langueDto.LangueDto;
import wf3.project.alpha_betise.mappers.LangueMapper;
import wf3.project.alpha_betise.serviceWrapper.LangueServiceWrapper;
import wf3.project.alpha_betise.services.LangueService;

@Component
@Transactional
public class LangueServiceWrapperImpl implements LangueServiceWrapper {

	@Autowired
	private LangueService langueService;

	@Autowired
	private LangueMapper langueMapper;

	@Override
	public List<LangueDto> getAll() {
		return langueMapper.toDtos(langueService.getAll());
	}

	@Override
	public LangueDto get(Long id) throws Exception {
		return langueMapper.toDto(langueService.get(id));
	}

	@Override
	public LangueDto post(LangueDto langue) {
		return langueMapper.toDto(langueService.post(langueMapper.toEntity(langue)));
	}

	@Override
	public void delete(Long id) {
		langueService.delete(id);
	}

}
