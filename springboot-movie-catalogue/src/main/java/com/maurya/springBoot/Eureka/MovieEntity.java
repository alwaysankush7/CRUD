package com.maurya.springBoot.Eureka;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class MovieEntity {

	private String movieName;
	private String genre;
	private double rating;
	
	public MovieEntity() {
		// TODO Auto-generated constructor stub
	}

	public MovieEntity(String movieName, String genre, double rating) {
		super();
		this.movieName = movieName;
		this.genre = genre;
		this.rating = rating;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}
	
	
	
	
}
