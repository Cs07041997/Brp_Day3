package com.bridgelabz.programDay3;

public class WindChill {

	public static void main(String[] args) {
		Utility utility  = new Utility();
		System.out.println("Enter the value of temperature t ");
		double t = utility.getDoubleValue();
		System.out.println("Enter the value of velocity v ");
		double v = utility.getDoubleValue();
		utility.weather(t, v);
	}
}
