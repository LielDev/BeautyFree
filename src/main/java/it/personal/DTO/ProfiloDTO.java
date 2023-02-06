package it.personal.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
public class ProfiloDTO {

    private Long idProfilo;
    private String nome;
    private String cognome;
    private  Sesso sesso;
    private int nota;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern =  "dd-MM-yyyy")
    private LocalDate data;


}
