package com.bridgelabz.programDay3;

import java.util.Scanner;

public class Utility {
	 Scanner sc;
     public Utility() {
 		sc = new Scanner (System.in);
     }
     
 	 public int getIntValue() {
     return sc.nextInt();
    }
 	 public double getDoubleValue() {
 		return sc.nextDouble();
 	}

 	 
 	 public void dayOfWeek(int day, int month, int year) {
 		int y = 0 ,m = 0,d = 0,x=0;
		y = year-(14-month)/12;
		x = y+y/(4-(y/100))+(y/400);
		
		m = month+12*((14-month)/12)-2;
		d = (day+x+31*m/12)%7;
		
		switch(d) {
		case 0:
			System.out.println("Sunday");
			break;
			
		case 1:
			System.out.println("Monday");
			break;
			
		case 2:
			System.out.println("Tuesday");
			break;
			
		case 3:
			System.out.println("Wenesday");
			break;
			
		case 4:
			System.out.println("Thursday");
			break;
			
		case 5:
			System.out.println("Friday");
			break;
			
		case 6:
			System.out.println("Satarday");
			break;		
		}
}
 	 
 	 public void carLoan(double P, double Y, double R) {
 	   double payment;
 	   double n = 12;
 	   double r = (R)/(12*100);
 	   payment = (P*r)/(1-Math.pow((1+r),(-n)));
 	   System.out.println("simple intrest of car loan "+payment);
 	 }
 	 
 	public void avgMinMax() {
 		 double num1, num2, num3, num4;
 		 double average;
 		num1= Math.random();
 		System.out.println("random number is "+num1);
 		num2= Math.random();
 		System.out.println("random number is "+num2);
 		average = num1 + num2;
 		System.out.println("Random number is "+average);
 		num3 = Math.min(num1, num2);
 		System.out.println("min number between num1 and num2 is "+num3);
 		num4 = Math.max(num1, num2);
 		System.out.println("min number between num1 and num2 is "+num4);
 	 }
 	
 	public void weather(double t, double v) {
 		double w;
 		w = 35.74 + 0.6215*t + (0.4275*t - 35.75)*Math.pow(v, 0.16);
 		System.out.println("Effective TEMP of weather is "+w);
 	}
}