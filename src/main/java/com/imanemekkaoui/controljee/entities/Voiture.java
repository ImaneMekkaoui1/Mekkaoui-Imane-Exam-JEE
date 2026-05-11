package com.imanemekkaoui.controljee.entities;

public class Voiture extends Vehicule {
    private int nombrePortes;
    @Enumerated(EnumType.STRING)
    private TypeCarburant typeCarburant;
    @Enumerated(EnumType.STRING)
    private BoiteVitesse boiteVitesse;
}