package com.matrimony.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matrimony.Entity.Customer;
import com.matrimony.Entity.Groom;
import com.matrimony.Exception.ResourceNotFoundException;
import com.matrimony.Repository.CustomerRepository;
import com.matrimony.Repository.GroomRepository;



@RestController
@RequestMapping("/api/v1")
public class GroomController {
	
	
	@Autowired
	private GroomRepository groomRepository;
	
	
	@GetMapping("/getgrooms")
	public List<Groom> getAllGrooms(){
		return groomRepository.findAll();
	}	
	
	
	
	
	@PostMapping("/addgrooms")
	public Groom createGroom(@RequestBody Groom groom) {
		return groomRepository.save(groom);
	}
	
	
	
	@GetMapping("/getgrooms/{id}")
	public ResponseEntity<Groom> getGroomById(@PathVariable Long id) {
		Groom groom = groomRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Groom not exist with id :" + id));
		return ResponseEntity.ok(groom);
	}
	
	
	
	@PutMapping("/updategrooms/{id}")
	public ResponseEntity<Groom> updateGroom(@PathVariable Long id, @RequestBody Groom groomDetails){
		Groom groom = groomRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Groom not exist with id :" + id));
		
		groom.setName(groomDetails.getName());
		groom.setAge(groomDetails.getAge());
		groom.setEducation(groomDetails.getEducation());
		groom.setProfession(groomDetails.getProfession());
		groom.setReligion(groomDetails.getReligion());
		groom.setHeight(groomDetails.getHeight());
		groom.setWeight(groomDetails.getWeight());
		groom.setLanguage(groomDetails.getLanguage());
		groom.setPhoneNumber(groomDetails.getPhoneNumber());
		groom.setLocation(groomDetails.getLocation());
		groom.setCountry(groomDetails.getCountry());
		groom.setMaritalstatus(groomDetails.getMaritalstatus());
		groom.setDivorsed(groomDetails.getDivorsed());
		groom.setWidowed(groomDetails.getWidowed());
		
		
		
		
		Groom updatedGroom = groomRepository.save(groom);
		return ResponseEntity.ok(updatedGroom);
	}
	

	@DeleteMapping("/deletegrooms/{id}")
	public ResponseEntity<Groom> deleteGroom(@PathVariable Long id){
		Groom groom = groomRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Groom not exist with id :" + id));
		
		 groomRepository.delete(groom);
		 return ResponseEntity.ok(groom);
		 
	}
	
	
}




