package com.imanemekkaoui.controljee.entities;

import com.imanemekkaoui.controljee.enums.BoiteVitesse;
import com.imanemekkaoui.controljee.enums.TypeCarburant;
import jakarta.persistence.Access;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Voiture extends Vehicule {

    private int nombrePortes;
    @Enumerated(EnumType.STRING)
    private TypeCarburant typeCarburant;
    @Enumerated(EnumType.STRING)
    private BoiteVitesse boiteVitesse;
}