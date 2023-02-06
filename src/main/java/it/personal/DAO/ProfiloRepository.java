package it.personal.DAO;

import it.personal.model.Profilo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface ProfiloRepository extends CrudRepository<Profilo, Long> {
}
