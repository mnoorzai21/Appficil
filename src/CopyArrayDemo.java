
public class CopyArrayDemo {

	public static void main(String[] args) {
		
//		int[] x = {0,1,2,3,4};
//		
//		int[] y = new int[5];
//						
//		for (int i=0; i<x.length; i++) {
//			y[i] = x[i];
//						
//			}
//		for (int i=0; i<y.length; i++) {
//			System.out.println(y[i]);
//		}
		
		
		int[] x = {0,1,2,3,4};
		int[] y = x;
		
		
		for (int i=0; i<x.length; i++) {
			y = x.clone();
						System.out.println(y[i])	;
		}
	}

}
