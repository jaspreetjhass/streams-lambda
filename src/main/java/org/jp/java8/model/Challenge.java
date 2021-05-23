package org.jp.java8.model;

public class Challenge {

	private String name;
	private double rating;
	
	public Challenge(String name, double rating) {
		super();
		this.name = name;
		this.rating = rating;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	@Override
	public String toString() {
		return "Challenge [name=" + name + ", rating=" + rating + "]";
	}
}
