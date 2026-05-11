package com.imanemekkaoui.controljee.entities;

import com.imanemekkaoui.controljee.enums.TypeMoto;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Moto extends Vehicule {
    private int cylindree;
    @Enumerated(EnumType.STRING)
    private TypeMoto typeMoto;
    private boolean casqueInclus;
}