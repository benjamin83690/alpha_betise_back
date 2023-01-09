package wf3.project.alpha_betise.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import wf3.project.alpha_betise.entities.Evenement;

@Repository
public interface EvenementRepository extends JpaRepository<Evenement, Integer> {

}
