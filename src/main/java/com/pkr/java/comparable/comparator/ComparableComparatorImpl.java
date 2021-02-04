package com.pkr.java.comparable.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class ComparableComparatorImpl {

	public static void main(String[] args) {
		ArrayList<Movie> list = new ArrayList<Movie>();
		list.add(new Movie("Force Awakens", 8.3, 2015, new Date(), "ACTIVE"));
		list.add(new Movie("Star Wars", 8.7, 1977, new Date(), "INACTIVE"));
		list.add(new Movie("Empire Strikes Back", 8.8, 1980, new Date(), "ACTIVE"));
		list.add(new Movie("Return of the Jedi", 8.4, 1983, new Date(), "ACTIVE"));
		list.add(new Movie("Star Wars", 8.6, 1978, new Date(), "ACTIVE"));
		list.add(new Movie("Force Awakens", 8.1, 2016, new Date(), "ACTIVE"));
		list.add(new Movie("Star Wars", 8.6, 1979, new Date(), "ACTIVE"));

		Collections.sort(list, Collections.reverseOrder());

		/*
		 * System.out.println("Movies after sorting : "); for (Movie movie: list) {
		 * System.out.println(movie.getName() + " " + movie.getRating() + " " +
		 * movie.getYear()+" " + movie.getLstUpdTs()+ " "+ movie.getStatus()); }
		 */
		
		Set<Movie> set = new HashSet<>(list);
		for (Movie movie: set)
		{
			System.out.println(movie.getName() + " " +
							movie.getRating() + " " +
							movie.getYear()+" " +
							movie.getLstUpdTs()+ " "+ movie.getStatus());
		}
	}
}

class NameComparator implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
		return o1.getName().compareTo(o2.getName());
	}
}
