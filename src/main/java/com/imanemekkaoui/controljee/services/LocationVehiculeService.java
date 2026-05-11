package com.imanemekkaoui.controljee.services;

import com.imanemekkaoui.controljee.dtos.LocationDTO;
import com.imanemekkaoui.controljee.dtos.VehiculeDTO;

import java.util.List;

public interface LocationVehiculeService {
    VehiculeDTO saveVehicule(VehiculeDTO dto);
    List<VehiculeDTO> listVehicules();
    LocationDTO louerVehicule(Long vehiculeId, LocationDTO dto);
}
