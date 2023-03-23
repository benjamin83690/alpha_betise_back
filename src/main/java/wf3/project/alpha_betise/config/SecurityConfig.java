package wf3.project.alpha_betise.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import lombok.RequiredArgsConstructor;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {

	private final JwtAuthenticationFilter jwtAuthFilter;
	private final AuthenticationProvider authenticationProvider;

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeHttpRequests().requestMatchers(HttpMethod.POST, "/livre").hasAuthority("ADMIN")
				.requestMatchers(HttpMethod.POST, "/evenements").hasAuthority("ADMIN")
				.requestMatchers(HttpMethod.GET, "/evenements/all").permitAll()
				.requestMatchers(HttpMethod.GET, "/livre/all").permitAll()
				.requestMatchers(HttpMethod.GET, "/livre/{id}").permitAll()
				.requestMatchers(HttpMethod.GET, "/livre/{id}").permitAll()
				.requestMatchers(HttpMethod.DELETE, "/evenements").hasAuthority("ADMIN")
				.requestMatchers(HttpMethod.POST, "/commentaires-utilisateur").hasAuthority("USER")
				.requestMatchers(HttpMethod.DELETE, "/commentaires-utilisateur").hasAnyAuthority("USER", "ADMIN")
				.requestMatchers("/auth/**").permitAll().anyRequest()
				.authenticated().and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
				.authenticationProvider(authenticationProvider)
				.addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class);

		return http.build();
	}
}
