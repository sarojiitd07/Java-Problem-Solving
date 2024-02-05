package com.in28minutes.java_8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MovieRunner{
	
	public static void main(String[] args) {
		List<Movie> movie = new ArrayList<Movie>();
		movie.add(new Movie("kal ho na ho", "ram raj", 100));
		movie.add(new Movie("kal ho", "somraj raj", 200));
		movie.add(new Movie("kabhi ho na ho", "raju raj", 500));
		movie.add(new Movie("mere alawa", "rustam raj", 50));
		
//		MovieRunner movierunner = new MovieRunner();
//		Collections.sort(movie);
		List<Movie> collect = movie.stream().sorted(Comparator.comparing(Movie::getMovieName)
				.thenComparing(Movie::getDirector)
				.thenComparing(Movie::getEarning))
				.collect(Collectors.toList());
		System.out.println(collect);
		List<Movie> movies = movie.stream().filter(e->e.getMovieName().startsWith("k")).collect(Collectors.toList());
		System.out.println(movies);
		
//		for(int i=0;i<movie.size();i++) {
//			System.out.println(collect.get(i).movieName + " " + collect.get(i).director + " " + collect.get(i).earning);
//		}

	}	
}

class Movie {
	private String movieName;
	private String director;
	private int earning;
	
	public Movie(String movieName, String director, int earning) {
		this.movieName = movieName;
		this.director = director;
		this.earning = earning;
	}
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getEarning() {
		return earning;
	}
	public void setEarning(int earning) {
		this.earning = earning;
	}

	public String toString() {
		return movieName + " " + director + " " + earning;
	}
}

class MovieComparator implements Comparator<Movie>{
	
	@Override
	public int compare(Movie m1, Movie m2) {
		if(m1.getEarning()>m2.getEarning()) {
			return 1;
		}else if(m1.getEarning()==m2.getEarning()) {
			return 0;
		}else {
			return -1;
		}
	}
}
