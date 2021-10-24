import javax.swing.JOptionPane;

public class scoreCheck {

	public static void main(String[] args) {

		double testScore;
		String input;

		input = JOptionPane.showInputDialog("Enter your numeric test score I will tell your grade ");
		testScore = Double.parseDouble(input);

		if (testScore < 60) {
			JOptionPane.showMessageDialog(null, "Your grade is F.");
		} else {
			if (testScore < 70) {
				JOptionPane.showMessageDialog(null, "Your grade is D.");
			} else {
				if (testScore < 80) {
					JOptionPane.showMessageDialog(null, "Your grade is C.");
				} else {
					if (testScore < 90) {
						JOptionPane.showMessageDialog(null, "Your grade is B.");
					} else {
						JOptionPane.showMessageDialog(null, "Your grade is A.");

					}
				}

			}
		}
		System.exit(0);
	}
}
