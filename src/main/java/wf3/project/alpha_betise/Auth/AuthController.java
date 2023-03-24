package wf3.project.alpha_betise.Auth;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

	private final AuthService service;

	@PostMapping("/inscription")
	public ResponseEntity<AuthResponseDto> register(@RequestBody RegisterRequestDto request) {
		return ResponseEntity.ok(service.register(request));
	}

	@PostMapping("/authentification")
	public ResponseEntity<AuthResponseDto> authenticate(@RequestBody AuthRequestDto request) throws Exception {
		return ResponseEntity.ok(service.authenticate(request));
	}

	@GetMapping(path = "/confirm")
	public RedirectView confirm(@RequestParam("token") String token) {
		return service.confirmToken(token);
	}

}
