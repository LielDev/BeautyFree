package it.personal.Controller;

import it.personal.DTO.LoginDTO;
import it.personal.DTO.UserDTO;
import it.personal.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/user")
public class UserController extends AbstractController<UserDTO>{

    @Autowired
    private UserService userService;


    //POST Angular a UserDTO
    @PostMapping(value = "/login")
    public UserDTO login( @RequestBody LoginDTO loginDTO ) {
        return userService.findByUsernameAndPassword(loginDTO.getUsername(), loginDTO.getPassword());
    }
}