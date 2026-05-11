package com.imanemekkaoui.controljee.mappers;

import com.imanemekkaoui.controljee.dtos.AgenceDTO;
import com.imanemekkaoui.controljee.entities.Agence;
import org.springframework.stereotype.Component;


@Component
public class AgenceMapper {
    public AgenceDTO fromAgence(Agence agence){
        return new AgenceDTO(
                agence.getId(),
                agence.getNom(),
                agence.getAdresse(),
                agence.getVille(),
                agence.getTelephone()
        );
    }
}
