package wf3.project.alpha_betise.errorHandler;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException.Forbidden;

import io.jsonwebtoken.ExpiredJwtException;

@RestControllerAdvice
public class GlobalErrorHandler {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> handleErrors(Exception exeception) {
		return ResponseEntity.badRequest().body(exeception.getMessage());
	}

	@ExceptionHandler(IllegalStateException.class)
	public ResponseEntity<?> handleErrors(IllegalStateException exeception) {
		return ResponseEntity.badRequest().body(exeception.getMessage());
	}

	@ExceptionHandler(ExpiredJwtException.class)
	public ResponseEntity<?> handleErrors(ExpiredJwtException exeception) {
		return ResponseEntity.badRequest().body(exeception.getMessage());
	}

	@ExceptionHandler(Forbidden.class)
	public ResponseEntity<?> handleErrors(Forbidden exeception) {
		return ResponseEntity.badRequest().body("acces interdit");
	}

	@ExceptionHandler(BadCredentialsException.class)
	public ResponseEntity<?> handleErrors(BadCredentialsException exeception) {
		return ResponseEntity.badRequest().body("Identifiant ou mot de passe incorrect.");
	}

	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<?> handleErrors(NullPointerException exeception) {
		return ResponseEntity.badRequest().body("Un champs obligatoire est vide. " + exeception.getMessage());
	}
}
