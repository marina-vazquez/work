import java.util.Scanner;

public class TP3_EJ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		int a;
		
		System.out.println("Ingrese la cantidad de personas a registrar: ");
		a = s.nextInt();
		
		String[][] registro = new String[3][a];
		String[] mat = new String[3];
		
		for (int i=0; i < a; i++) {
			System.out.println("Registre los datos de la persona nro " +(i+1));
			
			System.out.println("Nombre: ");
			registro[0][i] = s.next();
			
			System.out.println("D.N.I. : ");
			registro[1][i] = s.next();
			
			System.out.println("Edad: ");
			registro[2][i] = s.next();
			
		}
		
		for (int i=0; i < a ; i++) {
			for (int u=i+1; u < a; u++) {
				if (registro[0][i].compareTo(registro[0][u])>0) {
					
					for (int m=0; m < 3; m++) {
						mat[m] = registro[m][i];
						registro[m][i] = registro[m][u];
						registro[m][u] = mat[m];
						
						
					}
					
				}
			}
		}
		
		for (String[] Fila : registro) {
			for (String Elemento : Fila) {
				System.out.println("[" + Elemento + "]\t\t\t");
			}
			
			System.out.println(" ");
		}
		
		
	}

}