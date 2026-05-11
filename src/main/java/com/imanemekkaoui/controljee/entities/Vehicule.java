package com.imanemekkaoui.controljee.entities;

import com.imanemekkaoui.controljee.enums.StatutVehicule;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Data @NoArgsConstructor @AllArgsConstructor
public abstract class Vehicule {
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String marque;
        private String modele;
        @Column(unique = true)
        private String matricule;
        private double prixParJour;
        private LocalDate dateMiseEnService;
        @Enumerated(EnumType.STRING)
        private StatutVehicule statut;

        @ManyToOne
        private Agence agence;

        @OneToMany(mappedBy = "vehicule")
        private List<Location> locations;
}
