package com.carwash.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carwash.model.Washer;
import com.carwash.repository.WasherRepository;

@RestController
@RequestMapping("/washer")

public class CarWasherController {
	
	@Autowired
	private WasherRepository washerRepository;

     //Creating for Adding Washer	
	
	@PostMapping("/addwasher")
	public Washer saveWasher( @RequestBody Washer washer) {
		return washerRepository.save(washer);
	}
	
	
		
		//Reading Washer by ID
		@GetMapping("/allwashers/{id}")
		public Optional<Washer> getWasherById(@PathVariable int id) 
		{
			return washerRepository.findById(id);
		}		
		
		//Reading Washers
	    @GetMapping("/allwashers")
		 public List<Washer> getWasher() 
		 {
			return washerRepository.findAll();
		 }		
				
				
		 //Updating Washer by ID
		 @PutMapping("/update/{id}")		
		 public String UpdaterById(@PathVariable int id,@RequestBody Washer w) 
		 {
			washerRepository.save(w);
		    return "updated";
		  }	
		 
		 //Deleting Washer by ID
		 @DeleteMapping("/delete/{id}")
			public ResponseEntity<Object> deleteCustomerbyid (@PathVariable int id)
			{
				washerRepository.deleteById(id);
				return new ResponseEntity<Object>("Washer deleted with id "+id,HttpStatus.OK);
			}
		
		 
		 

				

}
