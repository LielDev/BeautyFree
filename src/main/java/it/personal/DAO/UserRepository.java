package it.personal.DAO;


import it.personal.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface UserRepository extends CrudRepository<User,Long> {
    User findByUsernameAndPassword(String Username, String password);
}
