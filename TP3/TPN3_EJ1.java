

public class ejercicio_arrayde100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numeros[] = new int[100];
		
		
		for (int i=0; i<numeros.length; i++) {
			for (int j=0; j<numeros.length-1;j++) {
				int aleatorio = (int)(Math.random()*101);
				numeros[i] = aleatorio;
				if (numeros[i] == numeros[j] && i!=j) {
						numeros[i] = aleatorio;
					}
				}
			}
		
			for (int numero : numeros) {
			System.out.println(numero);
			
		}
		

		
	}

}
