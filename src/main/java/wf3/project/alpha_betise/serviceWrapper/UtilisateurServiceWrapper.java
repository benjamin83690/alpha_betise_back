package wf3.project.alpha_betise.serviceWrapper;

import java.util.List;

import wf3.project.alpha_betise.dtos.utilisateurDto.UtilisateurDto;

public interface UtilisateurServiceWrapper {

	public List<UtilisateurDto> getAll();

	public UtilisateurDto get(String email) throws Exception;

	public UtilisateurDto post(UtilisateurDto utilisateur);

	public void delete(Long id);
}
