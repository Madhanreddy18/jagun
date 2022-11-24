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

import com.matrimony.Entity.Bride;
import com.matrimony.Entity.Groom;
import com.matrimony.Exception.ResourceNotFoundException;
import com.matrimony.Repository.BrideRepository;
import com.matrimony.Repository.GroomRepository;


@RestController
@RequestMapping("/api/v1")
public class BrideController {
			
		@Autowired
		private BrideRepository brideRepository;
		
		
		@GetMapping("/getbrides")
		public List<Bride> getAllBrides(){
			return brideRepository.findAll();
		}	
		
		
		
		
		@PostMapping("/addbrides")
		public Bride createBride(@RequestBody Bride bride) {
			return brideRepository.save(bride);
		}
		
		
		
		@GetMapping("/getbrides/{id}")
		public ResponseEntity<Bride> getBrideById(@PathVariable Long id) {
			Bride bride = brideRepository.findById(id)
					.orElseThrow(() -> new ResourceNotFoundException("Bride not exist with id :" + id));
			return ResponseEntity.ok(bride);
		}
		
		
		
		@PutMapping("/updatebrides/{id}")
		public ResponseEntity<Bride> updateBride(@PathVariable Long id, @RequestBody Bride brideDetails){
			Bride bride = brideRepository.findById(id)
					.orElseThrow(() -> new ResourceNotFoundException("Bride not exist with id :" + id));
			
			bride.setName(brideDetails.getName());
			bride.setAge(brideDetails.getAge());
			bride.setEducation(brideDetails.getEducation());
			bride.setProfession(brideDetails.getProfession());
			bride.setReligion(brideDetails.getReligion());
			bride.setHeight(brideDetails.getHeight());
			bride.setWeight(brideDetails.getWeight());
			bride.setLanguage(brideDetails.getLanguage());
			bride.setPhoneNumber(brideDetails.getPhoneNumber());
			bride.setLocation(brideDetails.getLocation());
			bride.setCountry(brideDetails.getCountry());
			bride.setMaritalStatus(brideDetails.getMaritalStatus());
			bride.setDivorsed(brideDetails.getDivorsed());
			bride.setWidowed(brideDetails.getWidowed());
			
			
			
			
			Bride updatedBride = brideRepository.save(bride);
			return ResponseEntity.ok(updatedBride);
		}
		

		@DeleteMapping("/deletebrides/{id}")
		public ResponseEntity<Bride> deleteBride(@PathVariable Long id){
			Bride bride = brideRepository.findById(id)
					.orElseThrow(() -> new ResourceNotFoundException("Bride not exist with id :" + id));
			
			 brideRepository.delete(bride);
			 return ResponseEntity.ok(bride);
			 
		}
		
		
	}







