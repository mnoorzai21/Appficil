import java.util.Random;

public class randomArray {

	public static void main(String[] args) {
	
		
		int[][] array = new int[2][2];
		
		Random rand = new Random();
				
		for (int r=0; r<array.length; r++) {
			for (int c=0; c<array[r].length; c++) { 
				array[r][c] = rand.nextInt(100);
				System.out.print(array[r][c] + "  ");
				
			}
			System.out.println();
		}
		
	}

}
