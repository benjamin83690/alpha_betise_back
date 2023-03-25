package wf3.project.alpha_betise.serviceWrapper.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import wf3.project.alpha_betise.dtos.DetailCommandeDto;
import wf3.project.alpha_betise.mappers.DetailCommandeMapper;
import wf3.project.alpha_betise.serviceWrapper.DetailCommandeServiceWrapper;
import wf3.project.alpha_betise.services.DetailCommandeService;

@Component
@Transactional
public class DetailCommandeServiceWrapperImpl implements DetailCommandeServiceWrapper {

	@Autowired
	private DetailCommandeService detailCommandeService;

	@Autowired
	private DetailCommandeMapper detailCommandeMapper;

	@Override
	public List<DetailCommandeDto> getAll() {
		return detailCommandeMapper.toDtos(detailCommandeService.getAll());
	}

	@Override
	public DetailCommandeDto get(Long id) throws Exception {
		return detailCommandeMapper.toDto(detailCommandeService.get(id));
	}

	@Override
	public DetailCommandeDto post(DetailCommandeDto detailCommande) {
		return detailCommandeMapper.toDto(detailCommandeService.post(detailCommandeMapper.toEntity(detailCommande)));
	}

	@Override
	public void delete(Long id) {
		detailCommandeService.delete(id);
	}

}
