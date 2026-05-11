package com.imanemekkaoui.controljee;


import com.imanemekkaoui.controljee.dtos.VehiculeDTO;
import com.imanemekkaoui.controljee.services.LocationVehiculeService;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class VehiculeRest {
    private LocationVehiculeService locationVehiculeService;

    public VehiculeRest(LocationVehiculeService service) {
        this.locationVehiculeService = service;
    }

    @GetMapping("/vehicules")
    public List<VehiculeDTO> getVehicules() {
        return locationVehiculeService.listVehicules();
    }
}