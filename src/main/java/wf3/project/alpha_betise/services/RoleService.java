package wf3.project.alpha_betise.services;

import java.util.List;

import wf3.project.alpha_betise.entities.Role;

public interface RoleService {

	public List<Role> getAll();

	public Role get(Long id) throws Exception;

	public Role post(Role role);

	public void delete(Long id);
}
