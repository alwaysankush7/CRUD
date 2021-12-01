package com.maurya.springBoot.Eureka;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

	@Autowired
	MovieService service;
	
	@GetMapping("/details")
	List<MovieEntity> getAllMovieDetails(){
		return service.getAllMovie();
	}
	
}
