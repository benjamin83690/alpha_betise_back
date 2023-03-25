package wf3.project.alpha_betise.serviceWrapper;

import java.util.List;

import wf3.project.alpha_betise.dtos.DetailCommandeDto;

public interface DetailCommandeServiceWrapper {

	public List<DetailCommandeDto> getAll();

	public DetailCommandeDto get(Long id) throws Exception;

	public DetailCommandeDto post(DetailCommandeDto detailCommande);

	public void delete(Long id);
}
