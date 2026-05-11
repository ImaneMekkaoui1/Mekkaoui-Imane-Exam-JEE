package com.imanemekkaoui.controljee.repository;

import com.imanemekkaoui.controljee.dtos.VehiculeDTO;
import com.imanemekkaoui.controljee.entities.Vehicule;
import com.imanemekkaoui.controljee.enums.StatutVehicule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VehiculeRepository extends JpaRepository<Vehicule,Long> {
    List<Vehicule> findByAgenceId(Long agenceId);
}