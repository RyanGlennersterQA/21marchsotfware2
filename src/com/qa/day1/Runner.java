package com.qa.day1;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World");
		
		//storing variables
		//When writing variables you have to specify datatype then name the variable and set the variable.
		//e.g data type is int, variable called 'age' and age assigned to 20
		int age = 20;
		//e.g data type is string, variable called 'name' and name is assigned to "Ryan"
		String name = "Ryan";
		
		//printing out the variables to the console
		System.out.println(name + age);
		
		//Calling on class hello and running method 1 from that class
		Hello.m1();
		
		//This is calling on m2 method and added on my own parameters.
		Hello.m2("Ryan", "Glennerster");
		
		System.out.println(Hello.m3());
		
		//Different variables.
		int num = 5;
		String str = "Hello";
		float price = 5.99f; //floats add an 'f' to the end
		boolean bool = true;
		char myCharacter = 'd';
		double myDouble = 232.7;
		long myLong = 42l; //longs are big intergers. Add an 'l' at the end.
		
		/////////////////////
		//assignment operator
		int i = 0;
		
		/////////////////////
		//arithmatic operator
		int i1 = 3 + 3; // addition
		int i2 = 3 - 3; //subtraction
		int i3 = 3 * 3; // multiplaction
		int i4 = 3 / 3; //division
		
		// modulo
		// anything % by 2 we can tell if it's odd or even because if it's % by 2 and comes back 0 its even
		// if it comes back as a remainder it is odd
		int i5 = 4 % 2; // 0 meaning it's even
		int i6 = 5 % 2; // 1 meaning its odd 
		
		/////////////////////
		//Unary operators
		int i7 = +935; // equivilent to saying a positive number
		int i8 = -935; // equivilent to saying it's a negative number
		int i9 = 10;
		i9 ++; // will do i9 +1
		i9 --; // will do i9 -1
		
		boolean b = true;
		boolean a = !b; // would flip the boolean so would return false.
		
		/////////////////////
		//compound operators
		// a shortcut of putting operators together.
		// +=, -=, *=, /=, %=, !=
		// effectively does two things, example would add the values and then assign it.
		
		int f = 3;
		f += 3; // will return 6. It adds the number and then assigns the answer to the variable f.
		
		int e = 3;
		e -= 3; //will return 0.
		
		int g = 5;
		g *= 4; //will return 20.
		
		int h = 2;
		h /= 2; // will return 1.
		
		int r = Calculator.add(5, 5);
		System.out.println(r);
	}
	
	
	

}
