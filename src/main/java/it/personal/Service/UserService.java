package it.personal.Service;


import it.personal.DAO.UserRepository;
import it.personal.DTO.UserDTO;
import it.personal.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService extends AbstractService<User, UserDTO> {


    public UserDTO findByUsernameAndPassword(String username, String password) {
        return converter.toDTO(((UserRepository)repository).findByUsernameAndPassword(username, password));
    }

}
