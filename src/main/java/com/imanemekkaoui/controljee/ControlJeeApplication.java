package com.imanemekkaoui.controljee;

import com.imanemekkaoui.controljee.entities.Vehicule;
import com.imanemekkaoui.controljee.enums.Status;
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
    CommandLineRunner start(ClientRepository clientRepository,
                            ContratRepository contratRepository) {
        return args -> {
            Client c1 = clientRepository.save(new Client(null, "Imane", "imane@gmail.com", new ArrayList<>()));

            Vehicule auto = new Vehicule();
            auto.setDateSouscription(LocalDate.now());
            auto.setStatut(Status.EN_COURS);
            auto.setMontantCotisation(3500);
            auto.setDureeContrat(12);
            auto.setTauxCouverture(80);
            auto.setNumeroImmatriculation("123-A-45");
            auto.setMarqueVehicule("Dacia");
            auto.setModeleVehicule("Logan");
            auto.setClient(c1);

            contratRepository.save(auto);
        };
    }

}
