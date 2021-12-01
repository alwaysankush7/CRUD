package com.maurya.springBoot.Eureka;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MovieService {
	
	
	List<MovieEntity> getAllMovie(){
		return Arrays.asList(
				new MovieEntity("KGF", "History and Action", 8.9),
				new MovieEntity("Bagban","Family Drama ",9),
				new MovieEntity("Pink", "Society and Thriller", 7.5)
				
				);
	}

}
