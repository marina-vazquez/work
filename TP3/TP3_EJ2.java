public class TP3_EJ2 {

	public static void main(String[] args) {
		// 

		int[][] array = new int[3][3];
		
		for (int i=0; i < 3; i++) {
			for (int j=0; j < 3; j++) {
				
				array[i][j] = (int)(Math.random()*100);
				
			}
		}
		
		for (int[] fila : array) {
			for (int elemento : fila) {
				System.out.println(elemento + " ");
			}
			
			System.out.println("");
		}
		
		
	}

}