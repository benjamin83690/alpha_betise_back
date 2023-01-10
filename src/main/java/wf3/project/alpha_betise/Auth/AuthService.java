package wf3.project.alpha_betise.Auth;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import wf3.project.alpha_betise.config.JwtService;
import wf3.project.alpha_betise.entities.Role;
import wf3.project.alpha_betise.entities.Utilisateur;
import wf3.project.alpha_betise.repositories.UtilisateurRepository;

@Service
@RequiredArgsConstructor
public class AuthService {

	private final UtilisateurRepository utilisateurRepository;
	private final PasswordEncoder passwordEncoder;
	private final JwtService jwtService;
	private final AuthenticationManager authenticationManager;

	public AuthResponse register(RegisterRequest request) {
		var utilisateur = Utilisateur.builder().prenom(request.getPrenom()).nom(request.getNom()).age(request.getAge())
				.email(request.getEmail()).motDePasse(passwordEncoder.encode(request.getMotDePasse()))
				.role(new Role(1, "USER"))
				.build();
		utilisateurRepository.save(utilisateur);
		var jwtToken = jwtService.generateToken(utilisateur);
		return AuthResponse.builder().token(jwtToken).build();
	}

	public AuthResponse authenticate(AuthRequest request) {
		authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(request.getEmail(), request.getMotDePasse()));
		var utilisateur = utilisateurRepository.findByEmail(request.getEmail()).orElseThrow();
		var jwtToken = jwtService.generateToken(utilisateur);
		return AuthResponse.builder().token(jwtToken).build();
	}
}
