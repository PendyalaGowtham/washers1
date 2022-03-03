package com.carwash.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carwash.model.Ratings;
import com.carwash.repository.RatingRepository;

@RestController
@RequestMapping("/ratings")
public class RatingController {

	
	@Autowired
    private RatingRepository ratingrepository;
	
	
	
	 //Creating and adding ratings
    @PostMapping("/addrating")
    public String saveRating(@RequestBody Ratings rating)
    {
    	ratingrepository.save(rating);
    return " Thanks for Your Valuable feedback. " + rating;
    }


    //Reading all ratings
    @GetMapping("/allratings")
    public List<Ratings> getAllRating()
    {
    return ratingrepository.findAll();
    		}


    //Read Rating By washerId
    @GetMapping("/ratings/{id}")
    public Optional<Ratings> getRatingById(@PathVariable int id)
    {
    return ratingrepository.findById(id);
    		
    }
    
}
