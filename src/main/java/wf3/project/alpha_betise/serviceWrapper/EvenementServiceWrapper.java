package wf3.project.alpha_betise.serviceWrapper;

import java.util.List;

import wf3.project.alpha_betise.dtos.EvenementDto;

public interface EvenementServiceWrapper {

	public List<EvenementDto> getAll();

	public EvenementDto get(Long id) throws Exception;

	public EvenementDto post(EvenementDto evenement);

	public void delete(Long id);

	public List<EvenementDto> getNextEvent();

	public List<EvenementDto> getPastEvent();
}
