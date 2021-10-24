import javax.swing.JOptionPane;

public class loanQualifier {

	public static void main(String[] args) {

		double salary;
		double yearsOnJob;
		String input;
		
		input = JOptionPane.showInputDialog("Enter your annual salary.");
		
		salary = Double.parseDouble(input);
		
		input = JOptionPane.showInputDialog("Enter the numbers of years in your current job.");
		
		yearsOnJob = Double.parseDouble(input);
		
		if (salary >= 30000) 
		{
			if (yearsOnJob >=2)
			{
				JOptionPane.showMessageDialog(null, "You are qualified for loan.");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "You have to be on your current job at least for two years to be qualified.");
			}
		
		}
		else
		{
			JOptionPane.showMessageDialog(null, "You are not quali"
					+ "fied. In order to be qualified you have to earn $30,000 per year.");
		}
		
		System.exit(0);
		
	}

}
