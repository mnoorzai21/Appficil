import javax.swing.JOptionPane;

public class logicalOption {

	public static void main(String[] args) {
		
		
		double salary, yearsOnJob;
		String input;
		
		input = JOptionPane.showInputDialog("Enter your annual salary.");
		
		salary = Double.parseDouble(input);
		
		input = JOptionPane.showInputDialog("Enter the number of years that your worked on your current job.");
		
		yearsOnJob = Double.parseDouble(input);
		
		if (salary > 30000 && yearsOnJob >= 2) {			
			JOptionPane.showMessageDialog(null, "You are qualified for loan.");
		}
		else {
			JOptionPane.showMessageDialog(null, "You do not qualify for loan.");
		}
		System.exit(0);

	}

}
