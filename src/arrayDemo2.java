import java.util.Random;

public class arrayDemo2 {

	public static void main(String[] args) {
		
		int[] temps = new int[365];
		
		for(int i=0; i<temps.length; i++) {
			Random rand = new Random();
			temps[i] = rand.nextInt(150);
			}
		for(int i=0; i<temps.length; i++) {
			System.out.println("temps[" + i + "] = " + temps[i]);
		
		}
	}

}
