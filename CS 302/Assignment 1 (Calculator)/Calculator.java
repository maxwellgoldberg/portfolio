// Title:            Calculator
// Semester:         Summer 2016
//
// Author:           Maxwell Goldberg
// Email:            mgoldberg4@wisc.edu
// CS Login:         mgoldberg4@wisc.edu
// Lecturer's Name:  Gerald

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args){
		// call scanner function
		Scanner input = new Scanner(System.in);
		
		//1) get first number
		
		//	declare and set variable numbOne
		System.out.println("Enter the first number: ");
		int numbOne = input.nextInt();
		
		//2) get second number
		
		//	declare and set variable numbTwo
		
		System.out.println("Enter the second number: ");
		int numbTwo = input.nextInt();
		
		//3) Calculator operations
		
		//	3a) Addition
		//		set addition variable and display
		int add = numbOne + numbTwo ; 
		System.out.println("Addition result: " + add);
		//	3b) Subtraction
		//		set subtraction variable and display
		int sub = numbOne - numbTwo ; 
		System.out.println("Subtraction result: " + sub);
		
		//	3c) Multiplication
		//		set multiplication variable and display
		int mult = numbOne * numbTwo ; 
		System.out.println("Multiplication result: " + mult);
		
		
		//	3d) Division
		//		set division variable and display
		int divInt = numbOne / numbTwo ; 
		System.out.println("Division result (int) : " + divInt);
		
		double divDouble = (double) numbOne / numbTwo;
		System.out.println("Division result (double)" + divDouble);
		
		
		//	3e) Remainder Division
		//		set remainder division variable and display
		int remDev = numbOne % numbTwo ; 
		System.out.println("Remainder division result: " + remDev);
		
		
		
	}
}
