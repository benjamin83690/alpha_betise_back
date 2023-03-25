package wf3.project.alpha_betise.serviceWrapper;

import java.util.List;

import wf3.project.alpha_betise.dtos.collectionDto.CollectionDto;

public interface CollectionServiceWrapper {

	public List<CollectionDto> getAll();

	public CollectionDto get(Long id) throws Exception;

	public CollectionDto post(CollectionDto collection);

	public void delete(Long id);
}
