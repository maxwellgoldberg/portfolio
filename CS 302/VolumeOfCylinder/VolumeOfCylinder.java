import java.util.Scanner;

public class VolumeOfCylinder {
	public static void main(String[] args){
		
		//declare a constant for PI
		//	final --> denotes not able to change throughout program
		//	Convention in JAVA is to capitalize constants
		final double PI = 3.14159;
		
		
		//1) define the radius of cylinder
		
		//	declare the variable radius
		double radius;
		
		//create a scanner 
		Scanner input  = new Scanner(System.in);
		
		//	assign a value to radius
		System.out.println("Enter the radius ");
		radius = input.nextDouble();
		
		//2) define the height of the cylinder
		
		//	declare a variable height (can assign and declare in one line)
		System.out.println("Enter the height ");
		double height = input.nextDouble(); 
		
		//3) calculate the volume using pi*r*r*h
		
		//	not declaring pi a variabl bc it is constant
		
		double volume = PI * radius*radius * height;
		
		//4) display the output
		
		//	print line
			System.out.println("Volume of cylinder = " + volume);
				
	}
}

