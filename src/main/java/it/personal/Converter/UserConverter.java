package it.personal.Converter;

import it.personal.DTO.UserDTO;
import it.personal.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.text.html.parser.Entity;

@Component
public class UserConverter extends AbstractConverter<User,UserDTO>{

@Autowired
    ProfiloConverter profiloConverter;

@Override
    public User toEntity(UserDTO userDTO) {
        User user = null;
        if (userDTO != null) {
            user = new User(userDTO.getId(), userDTO.getUsername(),userDTO.getPassword(),userDTO.getUsertype(),profiloConverter.toEntity(userDTO.getProfilo()));
        }
        return user;
    }

@Override
    public UserDTO toDTO(User user) {
        UserDTO userDTO = null;
        if (user != null) {
            userDTO = new UserDTO(user.getId(),user.getUsername(),user.getPassword(), user.getUsertype(),profiloConverter.toDTO(user.getProfilo()));
        }
        return userDTO;
    }


}
