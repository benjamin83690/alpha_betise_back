package wf3.project.alpha_betise.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import wf3.project.alpha_betise.entities.Evenement;

@Repository
public interface EvenementRepository extends JpaRepository<Evenement, Long> {

	@Query("SELECT e " + "FROM Evenement e " + "WHERE e.date >= ?1")
	List<Evenement> getNextEvent(LocalDate date);

	@Query("SELECT e " + "FROM Evenement e " + "WHERE e.date < ?1")
	List<Evenement> getPastEvent(LocalDate date);
}
