package wf3.project.alpha_betise.serviceWrapper;

import java.util.List;

import wf3.project.alpha_betise.dtos.etatStockDto.EtatStockDto;

public interface EtatStockServiceWrapper {

	public List<EtatStockDto> getAll();

	public EtatStockDto get(Long id) throws Exception;

	public EtatStockDto post(EtatStockDto etatStock);

	public void delete(Long id);
}
