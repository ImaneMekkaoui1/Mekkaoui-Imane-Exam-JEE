package com.imanemekkaoui.controljee;

import com.imanemekkaoui.controljee.dtos.VehiculeDTO;
import com.imanemekkaoui.controljee.services.LocationVehiculeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicules")
@CrossOrigin(origins = "http://localhost:4200")
public class VehiculeRest {

    private final LocationVehiculeService locationVehiculeService;

    public VehiculeRest(LocationVehiculeService locationVehiculeService) {
        this.locationVehiculeService = locationVehiculeService;
    }

    @GetMapping
    public List<VehiculeDTO> getVehicules() {
        return locationVehiculeService.listVehicules();
    }

    @GetMapping("/{id}")
    public VehiculeDTO getVehicule(@PathVariable Long id) {
        return locationVehiculeService.getVehicule(id);
    }

    @PostMapping
    public VehiculeDTO saveVehicule(@RequestBody VehiculeDTO dto) {
        return locationVehiculeService.saveVehicule(dto);
    }
}