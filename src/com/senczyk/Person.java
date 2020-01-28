package com.senczyk;

public class Person {

	private int age;
	private String firstName;
	private String lastName;
	
	public Person() {
	}
	
	public Person(int age, String firstName, String lastName) {
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void getPersonInfo() {
		System.out.println(this.firstName+" "+this.lastName+" age:"+this.age);
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
}
