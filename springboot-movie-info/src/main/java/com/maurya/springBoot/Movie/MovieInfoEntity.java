package com.maurya.springBoot.Movie;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class MovieInfoEntity {

	private int movieSerialnumber;
	private String starCast;

	public MovieInfoEntity(int movieSerialnumber, String starCast) {
//		super();
		this.movieSerialnumber = movieSerialnumber;
		this.starCast = starCast;
	}

}
