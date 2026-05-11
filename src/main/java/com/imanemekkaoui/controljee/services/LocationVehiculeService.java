package com.imanemekkaoui.controljee.services;

public interface LocationVehiculeService {
    VehiculeDTO saveVehicule(VehiculeDTO dto);
    List<VehiculeDTO> listVehicules();
    LocationDTO louerVehicule(Long vehiculeId, LocationDTO dto);
}
