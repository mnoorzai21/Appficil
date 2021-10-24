import java.util.Scanner;

public class Demo{
	
	public static void main (String []args) {
		
	Scanner scnr = new Scanner(System.in);
	System.out.println("Enter a number ");
		
		double a, b, c;

		a = scnr.nextDouble();
		
		System.out.println("Enter another number ");
		b = scnr.nextDouble();
		
		c = a*b;
		
	c = Math.round(c );
		System.out.println("Total is ");
		
		System.out.print( c);
	
		
	}
	
}