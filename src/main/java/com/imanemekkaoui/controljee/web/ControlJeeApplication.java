package com.imanemekkaoui.controljee;

import com.imanemekkaoui.controljee.entities.*;
import com.imanemekkaoui.controljee.enums.*;
import com.imanemekkaoui.controljee.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class ControlJeeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControlJeeApplication.class, args);
    }

    @Bean
    CommandLineRunner start(AgenceRepository agenceRepository,
                            VehiculeRepository vehiculeRepository) {
        return args -> {

            Agence agence1 = new Agence();
            agence1.setNom("Agence Centrale Mohammedia");
            agence1.setVille("Mohammedia");
            agence1.setAdresse("Boulevard Hassan II");
            agence1.setTelephone("0523123456");
            agenceRepository.save(agence1);


            Voiture v1 = new Voiture();
            v1.setMarque("Dacia");
            v1.setModele("Sandero Stepway");
            v1.setMatricule("12345-A-1");
            v1.setPrixParJour(350.0);
            v1.setDateMiseEnService(LocalDate.of(2023, 1, 15));
            v1.setStatut(StatutVehicule.Disponible);


            v1.setNombrePortes(5);
            v1.setTypeCarburant(TypeCarburant.Diesel);
            v1.setBoiteVitesse(BoiteVitesse.Manuelle);

            v1.setAgence(agence1);
            vehiculeRepository.save(v1);


            Moto m1 = new Moto();
            m1.setMarque("Yamaha");
            m1.setModele("T-MAX");
            m1.setMatricule("9999-B-6");
            m1.setPrixParJour(600.0);
            m1.setDateMiseEnService(LocalDate.now());
            m1.setStatut(StatutVehicule.Disponible);


            m1.setCylindree(560);
            m1.setTypeMoto(TypeMoto.Scooter);
            m1.setCasqueInclus(true);

            m1.setAgence(agence1);
            vehiculeRepository.save(m1);


            System.out.println("--- Rapport d'alimentation de la base de données ---");
            vehiculeRepository.findAll().forEach(v -> {
                System.out.println("ID: " + v.getId() + " | " + v.getMarque() + " " + v.getModele() +
                        " | Type: " + v.getClass().getSimpleName() +
                        " | Statut: " + v.getStatut());
            });
        };
    }
}