package com.learning.test.model;

public class User {

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id=" + id + ", name=" + name + ", age=" + age + ", weight=" + weight + ", gender=" + gender;
		// return super.toString();
	}

	private int id;
	private String name;
	private int age;
	private double weight;
	private char gender;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

}
