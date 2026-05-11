package com.imanemekkaoui.controljee.mappers;


import com.imanemekkaoui.controljee.dtos.VehiculeDTO;
import com.imanemekkaoui.controljee.entities.Moto;
import com.imanemekkaoui.controljee.entities.Vehicule;
import com.imanemekkaoui.controljee.entities.Voiture;
import org.springframework.stereotype.Component;

@Component
public class VehiculeMapper {

    public VehiculeDTO fromVehicule(Vehicule v){
        VehiculeDTO dto = new VehiculeDTO();
        dto.setId(v.getId());
        dto.setMarque(v.getMarque());
        dto.setModele(v.getModele());
        dto.setMatricule(v.getMatricule());
        dto.setPrixParJour(v.getPrixParJour());
        dto.setDateMiseEnService(v.getDateMiseEnService());
        dto.setStatut(v.getStatut().name());
        if(v.getAgence()!=null) dto.setAgenceId(v.getAgence().getId());

        if(v instanceof Voiture voiture){
            dto.setType("VOITURE");
            dto.setNombrePortes(voiture.getNombrePortes());
            dto.setTypeCarburant(voiture.getTypeCarburant().name());
            dto.setBoiteVitesse(voiture.getBoiteVitesse().name());
        }

        if(v instanceof Moto moto){
            dto.setType("MOTO");
            dto.setCylindree(moto.getCylindree());
            dto.setTypeMoto(moto.getTypeMoto().name());
            dto.setCasqueInclus(moto.isCasqueInclus());
        }
        return dto;
    }
}