package service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apicampeones.modelos.campeones;

import excepciones.ChampNotFoundException;
import repositorios.CampeonesRepo;

@Service
public class CampeonesService {
	private final CampeonesRepo campeonesRepo;
	
	@Autowired
	public CampeonesService (CampeonesRepo campeonesRepo) {
		this.campeonesRepo = campeonesRepo;
	}

	public campeones añadirCampeon(campeones campeones) {
		campeones.setNumeroCampeon(UUID.randomUUID().toString());
		return campeonesRepo.save(campeones);
	}
	
	public List<campeones> findAllCampeones(){
		return campeonesRepo.findAll();
	}
	
	public campeones updateCampeones (campeones campeones) {
		return campeonesRepo.save(campeones);
	}
	
	public void deleteCampeones(Long id) {
		campeonesRepo.deleteCampeonesById(id);
	}
	
	public campeones findCampeonesById(Long id) {
		return campeonesRepo.findCampeonesById(id)
				.orElseThrow(() -> new ChampNotFoundException ("Champ by id"+id+"was not found"));
	}
}
