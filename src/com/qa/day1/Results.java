package com.qa.day1;

public class Results {
	
	int physicsResult;
	int chemistryResult;
	int biologyResult;
	int total;
	double percentage;
	
	/*A person takes 3 exams in college, Physics, Chemistry, and Biology, each exam has a maximum of 150 marks.
	 * When all the exam marks have been added together, we can find the overall percentage that the person has
	 * got by multiplying their score by 100 and then dividing by 450.

	Create the results class, this class has 5 variables, Physics, Chemistry, and Biology, total and
	percentage. This class should also have 2 methods:

	Method 1 - displays the results that the person got for each exam and then the total mark.
	Try to make the output neat and bespoke for each exam.
	Method 2 - which finds and displays the percentage that the person received for the exams overall.	
	*/
	
	public void testResults(int result1, int result2, int result3) {
		total = result1 + result2 + result3;
		physicsResult = result1;
		chemistryResult = result2;
		biologyResult = result3;
		
		System.out.println("Your physics mark is:" + physicsResult);
		System.out.println("Your chemistry mark is:" + chemistryResult);
		System.out.println("Your biology mark is:" + biologyResult);
	}
	
	public void percentage() {
		percentage = total * 100 / 450;
		System.out.println("Your overall percentage is: " + percentage + "%");
	}
	
	}	
	


