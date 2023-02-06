package it.personal.DTO;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import it.personal.model.User.Usertype;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private  Long id;
    private String username;
    private String password;
    private Usertype usertype;

    @JsonFormat(shape= JsonFormat.Shape.OBJECT)
    private ProfiloDTO profilo;
}
