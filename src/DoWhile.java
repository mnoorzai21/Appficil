import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[]args) {
		
		Scanner scnr = new Scanner(System.in);
		
		double price;
		double total;
		int qty;
		String answer;
		
		do {
			System.out.println("Enter the price: ");
			price = scnr.nextDouble();
			
			System.out.println("Enter the quantity: ");
			qty = scnr.nextInt();
			
			total = price * qty;
			System.out.printf("The total is $%.2f\n", total);
			
			System.out.println("Do you want to calculate another total? Yes or No");
			
			answer = scnr.next();
		}
		
		while (answer.equalsIgnoreCase("Yes"));
		
		
		
	}
	

}
