package wf3.project.alpha_betise.config;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class JwtAuthenticationFilter extends OncePerRequestFilter {

	private final JwtService jwtservice;
	private final UserDetailsService userDetailsService;

	@Override
	protected void doFilterInternal(@NonNull HttpServletRequest request, @NonNull HttpServletResponse response,
			@NonNull FilterChain filterChain) throws ServletException, IOException {
		final String authHeader = request.getHeader("Authentication");
		final String jwt;
		final String utilisateurEmail;

		if (authHeader == null || !authHeader.startsWith("Bearer ")) {
			filterChain.doFilter(request, response);
			return;
		}
		jwt = authHeader.substring(7);
		utilisateurEmail = jwtservice.extractEmail(jwt);
		// si on recupere un email et que l'utilisateur n'est pas authentifier
		if (utilisateurEmail != null && SecurityContextHolder.getContext().getAuthentication() == null) {
			// recupere les details de l'utilisateur en bdd
			UserDetails userDetails = this.userDetailsService.loadUserByUsername(utilisateurEmail);
			// Verifie si le token utilisateur est valide ou non
			if (jwtservice.isTokenValid(utilisateurEmail, userDetails)) {
				// cree un token avec les details de l'utilisateur
				UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(userDetails,
						null, userDetails.getAuthorities());
				// renforce le token avec les details de la requete
				authToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
				// met a jour le token
				SecurityContextHolder.getContext().setAuthentication(authToken);
			}
		}
		filterChain.doFilter(request, response);
	}

}
