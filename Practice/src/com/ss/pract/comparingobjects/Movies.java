package com.ss.pract.comparingobjects;

public class Movies implements Comparable {
	private String name;
	private Integer year;
	private Float rating;
	
	/**
	 * @param name
	 * @param year
	 * @param rating
	 */
	public Movies(String name, Integer year, Float rating) {
		super();
		this.name = name;
		this.year = year;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Float getRating() {
		return rating;
	}

	public void setRating(Float rating) {
		this.rating = rating;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
