import java.text.DecimalFormat;

public class roundOffDemo {

	public static void main(String[] args) {
		
		
		DecimalFormat df = new DecimalFormat("$#,##0.00");
		
		double number1 = 1.234;
		double number2 = 12.345;
		double number3 = 125453.4546;
		double num;
		
		int number4 = 1234;
		
		num = number3/number1;
		
		
		
		System.out.printf("The number is: %09.2f \n", number1);
		System.out.printf("The number is: %09.2f \n", number2);
		System.out.println("The number is:" + df.format(number3));
		
		System.out.printf("The number is: %09d  \n", number4);
		
		System.out.printf("The resutl of division is: $%,.2f\n", num);
		
			
		System.out.println("The result of division is: " + df.format(num));
		
		
	}

}
