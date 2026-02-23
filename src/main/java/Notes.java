/**
	* File: Lesson 1.7 - Booleans (and, or, not)
	* Author: Mr. Kalisz
	* Date Created: Feb 14, 2023
	* Date Last Modified: Feb 23, 2026
	*/

import java.util.Scanner;

class Notes {
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		
		//booleans - nextBoolean() - get boolean from input

		boolean bool;
		System.out.print("Input a boolean: ");
		bool = input.nextBoolean();
		input.nextLine(); //clear the scanner
		
		//combining booleans

		//and - "&&" - shift 7

		System.out.println(true && false); //false
		System.out.println(7 > 5 && 5 < 3); //true && false
		
		// or - "||"    (capital \)

		System.out.println(true || false); //true
		System.out.println(7 > 5 || 5 < 3); //true

		// not - "!"

		System.out.println(!true); //false
		System.out.println(!(7 > 3)); //false


		int num;
		System.out.print("Input an integer: ");
		num = input.nextInt();

		System.out.println(!(num > 10  && num < 100)); //can not the whole thing
		System.out.println(num <= 10 || num >= 100); //or create an opposite condition


		//Order of Operations
		System.out.println(true || true && false); //true
		System.out.println((true || true) && false); //false
		
	}
}