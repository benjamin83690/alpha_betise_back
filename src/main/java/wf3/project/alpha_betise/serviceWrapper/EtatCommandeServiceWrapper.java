package wf3.project.alpha_betise.serviceWrapper;

import java.util.List;

import wf3.project.alpha_betise.dtos.etatCommandeDto.EtatCommandeDto;

public interface EtatCommandeServiceWrapper {

	public List<EtatCommandeDto> getAll();

	public EtatCommandeDto get(Long id) throws Exception;

	public EtatCommandeDto post(EtatCommandeDto etatCommande);

	public void delete(Long id);
}
