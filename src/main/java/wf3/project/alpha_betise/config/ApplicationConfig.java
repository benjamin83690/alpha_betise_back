package wf3.project.alpha_betise.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import lombok.RequiredArgsConstructor;
import wf3.project.alpha_betise.entities.Role;
import wf3.project.alpha_betise.entities.Utilisateur;
import wf3.project.alpha_betise.repositories.UtilisateurRepository;

@Configuration
@RequiredArgsConstructor
public class ApplicationConfig {

	private final UtilisateurRepository utilisateurRepository;
	private final JwtService jwtService;

	@Bean
	UserDetailsService userDetailsService() {

		return username -> utilisateurRepository.findByEmail(username)
				.orElseThrow(() -> new UsernameNotFoundException("Utilisateur introuvable"));
	}

	@Bean
	AuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
		authProvider.setUserDetailsService(userDetailsService());
		authProvider.setPasswordEncoder(passwordEncoder());
		return authProvider;
	}

	@Bean
	AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
		return config.getAuthenticationManager();
	}

	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	Utilisateur createAdmin() {
		Utilisateur admin = new Utilisateur(1L, "MR.admin", "ben-Admin", "admin@gmail.com",
				passwordEncoder().encode("123"), null, true, Role.ADMIN, null, null, null);
		var token = jwtService.generateToken(admin);
//		System.out.println(token);

		return utilisateurRepository.save(admin);
	}
}
