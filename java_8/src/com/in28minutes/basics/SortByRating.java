package com.in28minutes.basics;

import java.util.Comparator;

public class SortByRating implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {
		if(o1.getYear()>o2.getYear()) {
		return 1;
		}else if(o1.getYear()==o2.getYear()){
			return 0;
		}else {
			return -1;
		}
	}


//	@Override
//	public int compare(Movie o1, Movie o2) {
//		if(o1.getRating()>o2.getRating()) {
//			return 1;
//		}else if(o1.getRating()==o2.getRating()) {
//			return 0;
//		}else {
//			return -1;
//		}
//	}

}
