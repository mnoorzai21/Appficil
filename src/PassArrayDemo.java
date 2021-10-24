
public class PassArrayDemo {

	public static void main(String[] args) {
		
		
		String[] colors = {"blue", "purple", "yellow", "green", "red", "orange", "white"};
		
				//printColor(colors[2]);
		printColor(colors);
	}
	
	public static void printColor (String[] colors) {
		for (int i=0; i< colors.length; i++) {
			System.out.println(colors[i]);
		}
	}
	public static void printColor (String color)
	{
		System.out.println(color);		
	}
}
