import java.util.Scanner;

public class TP3_EJ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s= new Scanner(System.in);
        int[][] matriz= new int[3][3];
        System.out.println("Ingrese los elementos de la matriz: ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese el valor de la posicion "+i+" "+j);
                matriz[i][j] = s.nextInt();
            }
        }
        System.out.println("Matriz sin ordenar: \n");
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
                        if (matriz[i][j] > matriz[x][y]) {
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

