package com.imanemekkaoui.controljee.services;

import com.imanemekkaoui.controljee.dtos.LocationDTO;
import com.imanemekkaoui.controljee.dtos.VehiculeDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationVehiculeServiceImpl implements LocationVehiculeService {

    @Override
    public VehiculeDTO saveVehicule(VehiculeDTO dto) {
        return null; // logique à compléter
    }

    @Override
    public List<VehiculeDTO> listVehicules() {
        return List.of();
    }

    @Override
    public LocationDTO louerVehicule(Long vehiculeId, LocationDTO dto) {
        return null;
    }
}