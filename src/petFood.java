import java.util.Scanner;

public class petFood {

	public static void main(String[] args) {
		
		
		String input;
		char foodGrade;

		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Our pet food is available in three grades");
		System.out.println("Which one do you want print for? ");
		
		input = scnr.nextLine();
		foodGrade = input.charAt(0);
		
		switch (Character.toUpperCase(foodGrade)){
		
		case 'A':
			System.out.println("$ 10.00 per lb.");
			break;
		case 'B':
			System.out.println("$ 8.00 per lb");
			break;
		case 'C':
			System.out.println("$ 6.00 per lb.");
			break;
		default:
			System.out.println("Sorry we that order is not available. ");
			break;
		
		}

		
	}

}
