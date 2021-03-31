package com.qa.day1;

public class Hello {
	
	//creating a method inside the class.
	//this method is called method 1.
	public static void m1() {
		//This is the code inside the method.
		//This method is just printing the word "hello".
		System.out.println("Hello");
	}
	
	/*This is making a method that has parameters. So this method will print the string hello but then when
	 * you call this method you have to add your own inputs for the parameters.
	 * For this example it would be required to input a fname and lname.
	 */
	public static void m2(String fname, String lname) {
		System.out.println("Hello" + fname + lname);
	}
	
	/* This variable sets a string and saves the string in the method.
	 * 
	 */
	public static String m3() {
		return "Hello world - return";
	}
	
	
	}
