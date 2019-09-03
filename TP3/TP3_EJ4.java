
public class TP3_EJ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matriz = new int[3][3];
		
		for (int i=0; i < 3; i++) {
			for (int j=0; j < 3; j++) {
				matriz[i][j] = (int)(Math.random()*100);
			}
		}
		
		System.out.println("Matriz Desordenada: \n");
		
		 for (int[] fila : matriz) {
	            for (int elemento : fila) {
	                System.out.print(elemento + " ");
	            }
	            System.out.println("");
	        }
		 
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                for (int x = 0; x < 3; x++) {
	                    for (int y = 0; y < 3; y++) {
	                        if (matriz[i][j] < matriz[x][y]) {
	                            int t = matriz[i][j];
	                            matriz[i][j] = matriz[x][y];
	                            matriz[x][y] = t;
	                        }
	                    }
	                }
	            }
	        }
	        
	        System.out.println("Matriz ordenada: \n");

	        for (int[] fila : matriz) {
	            for (int elemento : fila) {
	                System.out.print(elemento + " ");
	            }
	            System.out.println("");
	        }	
		
		
	}

}
