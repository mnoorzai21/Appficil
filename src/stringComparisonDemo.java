
public class stringComparisonDemo {

	public static void main(String[] args) {
		
		String name1 = "Mary";
		String name2 = "mark";
		
		if (name1.compareToIgnoreCase(name2) == 0) 
			System.out.println("Tha names are the same.");
		
		else if (name1.compareToIgnoreCase(name2) > 0)
			System.out.println(name1.toUpperCase() + "is greater than " + name2.toUpperCase());
		else
			System.out.println(name1.toUpperCase() + "is less that "+ name2.toUpperCase());
	

	}

}
