package com.maurya.springBoot.Movie;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class MovieInfoService {
	

	@Autowired
	RestTemplate restTemplate;

	public MovieInfoEntity getBySerialNumber(int movieSerialnumber) {
		return new MovieInfoEntity(movieSerialnumber, "Yash Bhai , Rocky Bhai");
	}

	@HystrixCommand(fallbackMethod = "stillWork")
	public List<Object> getAllMovie() {
		// I don't have the all books catalogue here, but lets use RestTemplate to get
		// data from the other microservice

		String urlForMovieCatloge = "http://localhost:7001/details";

		return Arrays.asList(restTemplate.getForObject(urlForMovieCatloge, Object[].class));
	}

	public List<Object> stillWork(){
		return Arrays.asList(restTemplate.getForObject("Using Hystrix ....!", Object[].class))
	}
	
}
