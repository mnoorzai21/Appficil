import java.util.Scanner;

public class sentinalValue {
	
	public static void main(String[]args) {
		
		Scanner scnr = new Scanner(System.in);
		
		int score;
		int totalScore = 0;
		
		System.out.println("Enter your exam score or -1 to stop!");
		
		score = scnr.nextInt();
		
		while (score != -1) {
			totalScore += score;
			
			System.out.println("Enter another score!");
			
			score = scnr.nextInt();
			
		}
		
		System.out.println("Your total score is " + totalScore);
		
	}

}
