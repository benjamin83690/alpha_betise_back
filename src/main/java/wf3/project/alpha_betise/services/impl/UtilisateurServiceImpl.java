package wf3.project.alpha_betise.services.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import wf3.project.alpha_betise.Auth.token.ConfirmationToken;
import wf3.project.alpha_betise.Auth.token.ConfirmationTokenService;
import wf3.project.alpha_betise.entities.Utilisateur;
import wf3.project.alpha_betise.repositories.UtilisateurRepository;
import wf3.project.alpha_betise.services.UtilisateurService;

@Service
@Transactional
public class UtilisateurServiceImpl implements UtilisateurService {

	@Autowired
	private UtilisateurRepository utilisateurRepository;

	@Autowired
	ConfirmationTokenService confirmationTokenService;

	@Override
	public List<Utilisateur> getAll() {
		return utilisateurRepository.findAll();
	}

	@Override
	public Utilisateur get(Long id) throws Exception {
		return utilisateurRepository.findById(id).orElseThrow(() -> new Exception("Utilisateur introuvable"));
	}

	@Override
	public Utilisateur post(Utilisateur utilisateur) {
		return utilisateurRepository.save(utilisateur);
	}

	@Override
	public void delete(Long id) {
		utilisateurRepository.deleteById(id);
	}

	@Override
	public String signUpUser(Utilisateur utilisateur) {
		String token = UUID.randomUUID().toString();

		ConfirmationToken confirmationToken = new ConfirmationToken(token, LocalDateTime.now(),
				LocalDateTime.now().plusMinutes(15), utilisateur);

		confirmationTokenService.saveConfirmationToken(confirmationToken);

		return token;
	}

}
