package controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apicampeones.modelos.campeones;

import service.CampeonesService;

@RestController
@RequestMapping("/campeones")
public class CampeonController {
	private final CampeonesService campeonesService;
	
	public CampeonController(CampeonesService campeonesService) {
		this.campeonesService= campeonesService;
	}
	
	@GetMapping("/all")
	public ResponseEntity <List<campeones>> getAllCampeones(){
		List <campeones> campeones = campeonesService.findAllCampeones();
	return new ResponseEntity<>(campeones,HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity <campeones> getCampeonesById(@PathVariable("id")Long id){
		campeones campeones = campeonesService.findCampeonesById(id);
	return new ResponseEntity<>(campeones,HttpStatus.OK);
	}
}
