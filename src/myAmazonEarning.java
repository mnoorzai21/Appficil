import javax.swing.JOptionPane;

public class myAmazonEarning {

	public static void main(String[] args) {
		
		int blocks;
		double payments;
		double totalPayment;
		String input;
		
		input = JOptionPane.showInputDialog("Enter the numbers of Amazon Flex blocks that you worked this week: ");
		
		blocks = Integer.parseInt(input);
		
		totalPayment = 0.0;
		
		for (int count = 1; count <= blocks; count++) {
			
		input = JOptionPane.showInputDialog("Enter payment for block" + count + ": ");
		
		payments = Double.parseDouble(input);
		
		totalPayment += payments;
		}
		JOptionPane.showMessageDialog(null, String.format("Your total earning is $%,.2f\n", totalPayment));
		System.exit(0);
	}

}
