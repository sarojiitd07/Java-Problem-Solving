package com.in28minutes.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Movie{
	private String name;
	private float rating;
	private int year;
	
	public Movie(String name, float rating, int year) {
		this.name = name;
		this.rating = rating;
		this.year = year;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}


//	public int compareTo(Movie m) {
////		return this.name.compareTo(m.name);
//		if(this.rating > m.rating) {
//			return 1;
//		} else if(this.rating==m.rating) {
//			return 0;
//		}else {
//			return -1;
//		}
//		
//	}
//	

	
	public static void main(String[] args) {
		List<Movie> movielist = new ArrayList<>();
		movielist.add(new Movie("james Bond3", 8.5f, 2007));
		movielist.add(new Movie("james Bond2", 8f, 2003 ));
		movielist.add(new Movie("james Bond", 7.9f, 2001));
		movielist.add(new Movie("james Bond8", 6.9f, 2020));
		SortByRating sortbyRating = new SortByRating();
		
		Collections.sort(movielist, sortbyRating);
		
		for(Movie movie:movielist) {
			System.out.println(movie.getName()+ " "+ movie.getRating()+ " "+ movie.getYear());
		}
		
	}


}
