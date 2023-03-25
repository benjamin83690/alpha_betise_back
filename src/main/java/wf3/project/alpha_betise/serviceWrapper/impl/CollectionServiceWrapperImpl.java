package wf3.project.alpha_betise.serviceWrapper.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import wf3.project.alpha_betise.dtos.collectionDto.CollectionDto;
import wf3.project.alpha_betise.mappers.CollectionMapper;
import wf3.project.alpha_betise.serviceWrapper.CollectionServiceWrapper;
import wf3.project.alpha_betise.services.CollectionService;

@Component
@Transactional
public class CollectionServiceWrapperImpl implements CollectionServiceWrapper {

	@Autowired
	private CollectionService collectionService;

	@Autowired
	private CollectionMapper collectionMapper;

	@Override
	public List<CollectionDto> getAll() {
		return collectionMapper.toDtos(collectionService.getAll());
	}

	@Override
	public CollectionDto get(Long id) throws Exception {
		return collectionMapper.toDto(collectionService.get(id));
	}

	@Override
	public CollectionDto post(CollectionDto collection) {
		return collectionMapper.toDto(collectionService.post(collectionMapper.toEntity(collection)));
	}

	@Override
	public void delete(Long id) {
		collectionService.delete(id);
	}

}
