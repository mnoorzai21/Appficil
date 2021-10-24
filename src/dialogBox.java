import javax.swing.JOptionPane;

public class dialogBox {

	public static void main(String[] args) {
		

		String firstName;
		String lastName;
		
		firstName = JOptionPane.showInputDialog("What si your name?");
		lastName = JOptionPane.showInputDialog("What is your last name?");
		JOptionPane.showMessageDialog(null, "Hi " + firstName.toUpperCase() + " " + 
									lastName.toUpperCase() + ", welcome to programing world!!!!");
		
		System.exit(0);

	}

}
