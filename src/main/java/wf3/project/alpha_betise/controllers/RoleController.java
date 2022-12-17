package wf3.project.alpha_betise.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import wf3.project.alpha_betise.entities.Role;
import wf3.project.alpha_betise.services.RoleService;

@RestController
@RequestMapping("/role")
public class RoleController {

	@Autowired
	private RoleService roleService;

	@GetMapping("/all")
	public List<Role> getAll() {
		return roleService.getAll();
	}

	@GetMapping("/{id}")
	public Role get(@PathVariable("id") Integer id) throws Exception {
		return roleService.get(id);
	}

	@PostMapping
	public Role post(Role role) {
		return roleService.post(role);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Integer id) {
		roleService.delete(id);
	}
}
