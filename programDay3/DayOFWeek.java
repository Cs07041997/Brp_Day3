package com.bridgelabz.programDay3;

public class DayOFWeek {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter your Day");
		int day = utility.getIntValue();
		System.out.println("Enter your Month");
		int month = utility.getIntValue();
		System.out.println("Enter your year");
		int year = utility.getIntValue();
		utility.dayOfWeek(day, month, year);
	}
}
