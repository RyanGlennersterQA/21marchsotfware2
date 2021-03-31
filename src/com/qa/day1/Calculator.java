package com.qa.day1;

public class Calculator {
	
	//Create a method that accepts two integers as input, then returns an integer that is the sum of these
	//two parameters (addition)
	public static int add(int num1, int num2) {
		int total = num1 + num2;
		return total;
	}
	
	//Create the following additional three methods that each take two parameters:
	 
	//Multiplication - which takes two numbers and returns the product.
	public static double multiplaction (double num1, double num2) {
		return num1 * num2;
	}
	
	
	//Subtraction - which takes two numbers, then returns the result of the subtraction.
	public static double subtraction (double num3, double num4) {
		return num3 - num4;
	}
	
	//Division - which takes two numbers, then returns the result of the division.
	public static double division (double num5, double num6) {
		return num5 - num6;
	}
}
