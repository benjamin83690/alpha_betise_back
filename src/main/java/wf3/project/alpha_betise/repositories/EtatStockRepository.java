package wf3.project.alpha_betise.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import wf3.project.alpha_betise.entities.EtatStock;

@Repository
public interface EtatStockRepository extends JpaRepository<EtatStock, Long> {

}
