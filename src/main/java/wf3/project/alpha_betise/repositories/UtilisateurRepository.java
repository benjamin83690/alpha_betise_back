package wf3.project.alpha_betise.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import wf3.project.alpha_betise.entities.Utilisateur;

@Repository
@Transactional(readOnly = true)
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

	Optional<Utilisateur> findByEmail(String email);

	@Transactional
	@Modifying
	@Query("UPDATE Utilisateur u " + "SET u.activer = TRUE WHERE u.email = ?1")
	int enableAppUser(String email);
}
