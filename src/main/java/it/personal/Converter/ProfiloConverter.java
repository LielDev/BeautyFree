package it.personal.Converter;

import it.personal.DTO.ProfiloDTO;
import it.personal.model.Profilo;
import org.springframework.stereotype.Component;

@Component
public class ProfiloConverter extends AbstractConverter<Profilo, ProfiloDTO> {

    public Profilo toEntity(ProfiloDTO profiloDTO) {
        Profilo profilo = new Profilo();
        if (profiloDTO != null) {
            profilo = new Profilo(profiloDTO.getIdProfilo(), profiloDTO.getNome(), profiloDTO.getCognome(), profiloDTO.getSesso(),profiloDTO.getNota(), profiloDTO.getData()) ;
        }
        return profilo;
    }

@Override
    public ProfiloDTO toDTO(Profilo profilo) {
        ProfiloDTO profiloDTO = null;
        if (profilo != null) {
            profiloDTO = new ProfiloDTO(profilo.getId(),profilo.getNome(),profilo.getCognome(),profilo.getSesso(),profilo.getNota(),profilo.getData());
        }
        return profiloDTO;
    }




}