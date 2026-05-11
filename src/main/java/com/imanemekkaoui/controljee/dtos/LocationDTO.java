package com.imanemekkaoui.controljee.dtos;

import java.time.LocalDate;

public class LocationDTO {
    private Long id;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private double montant;
    private Long vehiculeId;

    public LocationDTO(Long id, LocalDate dateDebut, LocalDate dateFin, double montant, Long aLong) {
    }
}
