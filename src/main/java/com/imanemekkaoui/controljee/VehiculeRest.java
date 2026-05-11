package com.imanemekkaoui.controljee;


import com.imanemekkaoui.controljee.dtos.VehiculeDTO;
import com.imanemekkaoui.controljee.services.LocationVehiculeService;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicules")
@RequiredArgsConstructor
public class VehiculeRest {
    private final LocationVehiculeService service;

    @GetMapping
    public List<VehiculeDTO> all(){
        return service.listVehicules();
    }

    @PostMapping
    public VehiculeDTO save(@RequestBody VehiculeDTO dto){
        return service.saveVehicule(dto);
    }
}
