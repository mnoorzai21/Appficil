import javax.swing.JOptionPane;

public class totalSalesPopUp {

	public static void main(String[] args) {
		
		int days;
		double sales;
		double totalSales;
		String input;

		input = JOptionPane.showInputDialog("For how many days do you have sales figures?");

		days = Integer.parseInt(input);

		totalSales = 0.0;

		for (int count = 1; count <= days; count++) {
			input = JOptionPane.showInputDialog("Entre sales for day " + count +": ");

			sales = Double.parseDouble(input);

			totalSales += sales;
		}
		JOptionPane.showMessageDialog(null, String.format("The total sales are $%,.2f" , totalSales));
		System.exit(0);
	}

}
