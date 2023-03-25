package wf3.project.alpha_betise.serviceWrapper;

import java.util.List;

import wf3.project.alpha_betise.dtos.EditeurDto;

public interface EditeurServiceWrapper {

	public List<EditeurDto> getAll();

	public EditeurDto get(Long id) throws Exception;

	public EditeurDto post(EditeurDto editeur);

	public void delete(Long id);
}
