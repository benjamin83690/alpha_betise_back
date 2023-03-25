package wf3.project.alpha_betise.serviceWrapper.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import wf3.project.alpha_betise.dtos.utilisateurDto.UtilisateurDto;
import wf3.project.alpha_betise.mappers.UtilisateurMapper;
import wf3.project.alpha_betise.serviceWrapper.UtilisateurServiceWrapper;
import wf3.project.alpha_betise.services.UtilisateurService;

@Component
@Transactional
public class UtilisateurServiceWrapperImpl implements UtilisateurServiceWrapper {

	@Autowired
	private UtilisateurService utilisateurService;

	@Autowired
	private UtilisateurMapper utilisateurMapper;

	@Override
	public List<UtilisateurDto> getAll() {
		return utilisateurMapper.toDtos(utilisateurService.getAll());
	}

	@Override
	public UtilisateurDto get(String email) throws Exception {
		return utilisateurMapper.toDto(utilisateurService.get(email));
	}

	@Override
	public UtilisateurDto post(UtilisateurDto utilisateur) {
		return utilisateurMapper.toDto(utilisateurService.post(utilisateurMapper.toEntity(utilisateur)));
	}

	@Override
	public void delete(Long id) {
		utilisateurService.delete(id);
	}

}
