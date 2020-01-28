package com.senczyk;

public class Maths {
	private int x;

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
