import java.util.Scanner;

public class demo1 {
	
	public static void maing(String[]args) {
		
		System.out.println("What is your first name?");
		
		String name;
		String lastName;
		
		Scanner scnr = new Scanner(System.in);
	
		name = scnr.nextLine();
		
		System.out.println("What is your lasrt name?");
		
		lastName = scnr.nextLine();
		
		System.out.println("Hi " + name + lastName + "welcome to Java programing.");
		
		
	}
	

}
