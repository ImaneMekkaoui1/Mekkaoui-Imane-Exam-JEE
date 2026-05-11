package com.imanemekkaoui.controljee.mappers;

import com.imanemekkaoui.controljee.dtos.LocationDTO;
import com.imanemekkaoui.controljee.entities.Location;
import org.springframework.stereotype.Component;

@Component
public class LocationMapper {
    public LocationDTO fromLocation(Location location){
        return new LocationDTO(
                location.getId(),
                location.getDateDebut(),
                location.getDateFin(),
                location.getMontant(),
                location.getVehicule()!=null ? location.getVehicule().getId() : null
        );
    }
}
