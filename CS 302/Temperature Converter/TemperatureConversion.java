import java.util.Scanner;

public class TemperatureConversion {
	public static void main(String[] args) {
		
		// define constant conversion as K
		//	USE DOUBLES FOR MATH ---> Integers round, division to 0
		final double K = (5.0/9.0);

		
		// user input called
		//	input is just a place holder, can be 'in' or anything
		
		Scanner input = new Scanner(System.in);
		
		// get degrees F from user
		
		System.out.println("Enter temperature in degrees fahrenheit");
		double fahrenheit = input.nextDouble();
		
		// convert Fahrenheit to celcius
		
		double celcius = K * (fahrenheit - 32);
		
		// print degrees in celcius
		
		System.out.println("temperature in celcius = " + celcius);
				
	}
}
