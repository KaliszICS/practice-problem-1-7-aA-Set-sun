/*
	File: Lesson 1.7 - Booleans (and, or, not)
	Author: Angie
	Date Created: Feb 23, 2023
	Date Last Modified: Feb 23, 2026
	*/

import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		//Write question 1 code here
		/*Create two Booleans called bool1 which is assigned to true, 
		and bool2 that is assigned to false. 
		Output the result of them being ANDed together, 
		then output the result of them being ORed together. 
		Output these results on different lines. */

		boolean bool1;
		boolean bool2;

		bool1 = true;
		bool2 = false;

		System.out.println(bool1 && bool2);
		System.out.println(bool1 || bool2);

	}

	public static void q2() {
		//Write question 2 code here
		/*Ask the user to "Input a lowercase letter: " and store it in a variable. 
		Ask the user to "Input another lowercase letter: " and store it in another variable. 
		Output true if the first letter happens earlier in the alphabet, False otherwise. */

	Scanner input = new Scanner(System.in);
	String lowcase;
	String anotherlcase;

	System.out.print("Input a lowercase letter: ");
	lowcase = input.nextLine();

	System.out.print("Input another lowercase letter: ");
	anotherlcase = input.nextLine();

	System.out.println(lowcase.compareTo(anotherlcase) < 0);


	}

	public static void q3() {
		//Write question 3 code here
		/*Ask the user to "Input a number: ". 
		Output true when the value is between 0 and 10 (inclusive). 
		Output false otherwise. */
	
	Scanner input = new Scanner(System.in);

	double num;

	System.out.print("Input a number: ");
	num = input.nextDouble();
	System.out.println(num <= 10 && num >= 0);

	}

	public static void q4() {
		//Write question 4 code here
		/* Ask the user to "Input a number: ". 
		Output true when the number is positive and is not 5. 
		Output false otherwise. */

	Scanner input = new Scanner(System.in);

	double num;

	System.out.print("Input a number: ");
	num = input.nextDouble();

	System.out.println(num > 0 && num != 5);


	}

	public static void q5() {
		//Write question 5 code here
		/*Ask the user to "Input a word: ". 
		Ouput true when the word is not "banana". 
		Output false otherwise. */

	Scanner input = new Scanner(System.in);

	String word; 
	
	System.out.print("Input a word: ");
	word = input.nextLine();

	System.out.println(word != "banana");




	}

	public static void q6() {
		//Write question 5 code here
		/*Ask the user, “Enter an integer: ” 
		Input the user’s response from the keyboard, test the integer to see if it is even or odd (use the modulus operator % to do this), 
		and then output the result as shown below (several runs are shown): */
	
	Scanner input = new Scanner(System.in);


	}

}
