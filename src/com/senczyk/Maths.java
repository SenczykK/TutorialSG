package com.senczyk;

public class Maths {
	private int x;
	
	public void getRangeAndCheck() {
		System.out.println("Write a start range number");
		int startRange = Integer.parseInt(System.console().readLine());
		System.out.println("Write a end range number");
		int endRange = Integer.parseInt(System.console().readLine());
		
		this.checkInRange(startRange, endRange);
	}

	public void checkInRange(int startRange, int endRange) {
		for( ; startRange<endRange; startRange++) {
			if( startRange%3 == 0 && startRange%5 ==0 ) {
				System.out.println("Number "+startRange+" is valid");
			}
		}
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public boolean isEven() {
		if( this.x%2 == 0) return true;
		else return false;
	}
	
	public boolean isEven(int x) {
		if( x%2 == 0) return true;
		else return false;
	}
}
