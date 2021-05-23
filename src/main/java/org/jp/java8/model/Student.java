package org.jp.java8.model;

public class Student {

	private String name;
	private int age;
	private String nationality;
	private Challenge challenge;

	public Student(String name, int age, String nationality, Challenge challenge) {
		super();
		this.name = name;
		this.age = age;
		this.nationality = nationality;
		this.challenge = challenge;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Challenge getChallenge() {
		return challenge;
	}

	public void setChallenge(Challenge challenge) {
		this.challenge = challenge;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", nationality=" + nationality + ", challenge=" + challenge
				+ "]";
	}

}
