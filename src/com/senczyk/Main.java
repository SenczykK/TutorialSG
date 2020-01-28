package com.senczyk;

import java.util.ArrayList;
import java.util.List;

public class Main {

	/**
	 * List (array) of Person objects
	 */
	static List<Person> listOfEmplyee = new ArrayList<>();
	
	public static void main(String[] args) {
		/**
		 * Declare a new Person object and add it to List
		 */
		listOfEmplyee.add(new Person(24, "Kamil", "Senczyk"));
		listOfEmplyee.add(new Person(23, "SS", "XX"));

		/**
		 * in for iteration the method get a one object from list (.get() function) and
		 * starta method .setPersonInfo()
		 */
		for (int i = 0; i < listOfEmplyee.size(); i++) {
			listOfEmplyee.get(i).getPersonInfo();
		}
		
		/**
		 * function that create Stream form List (array) and make a .getPersonInfo() method for all inserted Persons objects
		 */
		listOfEmplyee.stream().forEach(x -> x.getPersonInfo());
		
		/**
		 * create Maths object, set a 5 number inside of it
		 * print and check is it Even
		 */
		Maths number = new Maths();
		//number.getRangeAndCheck();
		System.out.println(number.recurentPower(2, 2));
		System.out.println(number.recurentPower(2, 3));
		
				
	}
}
