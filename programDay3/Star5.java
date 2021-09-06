package com.bridgelabz.programDay3;

public class Star5 {
	
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("press any number to get random number num1 ");
		double num1 = utility.getDoubleValue();
		System.out.println("press any number to get random number num2 ");
		double num2 = utility.getDoubleValue();
		utility.avgMinMax();

	}

}
