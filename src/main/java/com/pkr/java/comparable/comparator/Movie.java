package com.pkr.java.comparable.comparator;

import java.util.Date;

import org.apache.commons.lang3.builder.CompareToBuilder;

// A class 'Movie' that implements Comparable
class Movie implements Comparable<Movie>
{
	private double rating;
	private String name;
	private int year;
	private Date lstUpdTs;
	private String status;

	// Constructor
	public Movie(String nm, double rt, int yr, Date lstUpdTs, String status)
	{
		this.name = nm;
		this.rating = rt;
		this.year = yr;
		this.lstUpdTs=lstUpdTs;
		this.status=status;
	}

	// Getter methods for accessing private data
	public double getRating() { return rating; }
	public String getName() { return name; }
	public int getYear()	 { return year; }
	public Date getLstUpdTs() {return lstUpdTs;}
	public String getStatus() {return status;}

	@Override
	public int compareTo(Movie o) {
		if (o == null) {
			return -1;
		}

		CompareToBuilder buider = new CompareToBuilder();

		return buider
				.append(o.getName(), this.getName())
				.append(this.getLstUpdTs(), o.getLstUpdTs())
				.append(o.getStatus(), this.getStatus())
				.toComparison();
	}

	@Override
	public int hashCode() {
		if("ACTIVE".equals(this.getStatus())) {
			return 1;
		} else {
			return 2;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if(this.getName() == ((Movie)obj).getName() && this.getStatus() == ((Movie)obj).getStatus()) {
			return true;
		} else {
			return false;
		}
	}
}