package com.imanemekkaoui.controljee.repository;

public interface VehiculeRepository extends JpaRepository<Vehicule,Long> {
    List<Vehicule> findByStatut(StatutVehicule statut);
}