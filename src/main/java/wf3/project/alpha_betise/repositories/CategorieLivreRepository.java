package wf3.project.alpha_betise.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import wf3.project.alpha_betise.entities.CategorieLivre;

@Repository
public interface CategorieLivreRepository extends JpaRepository<CategorieLivre, Integer> {

}
