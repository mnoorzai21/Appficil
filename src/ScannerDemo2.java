import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {

		
		System.out.println("What is your name?");
		
		Scanner keyboard = new Scanner(System.in);
		String name  = keyboard.nextLine();
		
		System.out.println("Hi "+ name.toUpperCase() + "\nHow old are you? ");
		
		int age = keyboard.nextInt();
		System.out.println("You are " + age + " years old. \nHow much money do you have? ");
		
		double money = keyboard.nextDouble();
		System.out.println("You have $" + money+ "\nWhat is your favorite character?");
		
		char favorite = keyboard.next().charAt(0);
		System.out.println("And you love " + favorite);
		
		
		String message = "Java Is Great Fun!";
		String upper = message.toUpperCase();
		String lower = message.toLowerCase();
		char letter = message.charAt(2);
		int stringSize = message.length();
		
		System.out.println(message +"\n" + upper + "\n" + lower + "\n" + letter +"\n" + stringSize );
		
		
		
		
		
	}

}
