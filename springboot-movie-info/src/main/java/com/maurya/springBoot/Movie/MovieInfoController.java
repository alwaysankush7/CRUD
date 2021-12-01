package com.maurya.springBoot.Movie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieInfoController {

	@Autowired
	MovieInfoService service;
	
	@GetMapping("/{movieSerialnumber}")
	MovieInfoEntity getMovieByNumber(@PathVariable int movieSerialnumber) {
		return service.getBySerialNumber(movieSerialnumber);
	}
	
	@RequestMapping("/all")
	List<Object> getMovieCatlogDetails(){
		return service.getAllMovie();
	}
	
	
}
