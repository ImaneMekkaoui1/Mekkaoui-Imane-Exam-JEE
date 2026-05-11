package com.imanemekkaoui.controljee.dtos;

import lombok.Data;

import java.time.LocalDate;

@Data


public class VehiculeDTO {
                private Long id;
                private String type;
                private String marque;
                private String modele;
                private String matricule;
                private double prixParJour;
                private LocalDate dateMiseEnService;
                private String statut;
                private Long agenceId;

                // voiture
                private Integer nombrePortes;
                private String typeCarburant;
                private String boiteVitesse;

                // moto
                private Integer cylindree;
                private String typeMoto;
                private Boolean casqueInclus;
        }

