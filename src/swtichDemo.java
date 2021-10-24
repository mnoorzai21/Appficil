
public class swtichDemo {

	public static void main(String[] args) {
		
		
		char grade = 'b';
		
		switch (Character.toUpperCase(grade)) {
		case 'A':
			System.out.println("You got an A! good job!");
			break;
		case 'B':
			System.out.println("You got a B! good job!");
			break;
		case 'C':
			System.out.println("You got a C!");
			break;
		default:
			System.out.println("You suck!");
			break;
		
		}

	}

}
