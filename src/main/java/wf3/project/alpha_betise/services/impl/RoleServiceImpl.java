package wf3.project.alpha_betise.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import wf3.project.alpha_betise.entities.Role;
import wf3.project.alpha_betise.repositories.RoleRepository;
import wf3.project.alpha_betise.services.RoleService;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleRepository roleRepository;

	@Override
	public List<Role> getAll() {
		return roleRepository.findAll();
	}

	@Override
	public Role get(Long id) throws Exception {
		return roleRepository.findById(id).orElseThrow(() -> new Exception("Role introuvable"));
	}

	@Override
	public Role post(Role role) {
		return roleRepository.save(role);
	}

	@Override
	public void delete(Long id) {
		roleRepository.deleteById(id);
	}

}
