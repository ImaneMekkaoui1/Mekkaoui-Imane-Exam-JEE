package com.imanemekkaoui.controljee.web;

@RestController
@RequestMapping("/api/vehicules")
@RequiredArgsConstructor
public class VehiculeRestController {
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