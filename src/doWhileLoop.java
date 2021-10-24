import java.util.Scanner;

public class doWhileLoop {

	public static void main(String[] args) {
		
		
		Scanner scnr = new Scanner(System.in);
		String answer;
		do {
			System.out.println("Enter the price: ");
			double price = scnr.nextDouble();
			
			System.out.println("Enter the quantity: ");
			int qty = scnr.nextInt();
			
			double total = qty * price;
			
			System.out.printf("The total is $%.2f .\n", total);
			
			System.out.println("Do you want to calculate another total? Yes or No");
			answer = scnr.next();
		}
		while (answer.equalsIgnoreCase("Yes"));

	}

}
