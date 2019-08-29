import java.util.Scanner;

public class Usocuentas {

	public static void main(String[] args) {
		// TP N 5
		Scanner sc = new Scanner(System.in);
		
		int c,op,mon,mon2;
		double deposit;
		
		System.out.println("Ingrese la cantidad de cuentas que desee agregar: ");
		c = sc.nextInt();
		
		CuentaCorriente[] cuentas = new CuentaCorriente[c];
		
		for (int i=0; i<c; i++) {
			System.out.println("Ingrese datos de la cuenta" + (i+1));
			System.out.println("Titular de la cuenta: ");
			cuentas[i].setTitular(sc.next());
			
			System.out.println("Saldo: ");
			cuentas[i].setSaldo(sc.nextDouble());
			
		}
		
		System.out.println("Seleccion la opciona a realizar: ");
		System.out.println("(1)Depositar \n(2)Retirar \n(3)Saldo Actual \n(4)Informacion de la Cuenta \n(5)Tranferencias");
		op = sc.nextInt();
		
		switch (op) {
		case 1 : System.out.println("Seleccione a qué cuenta depositar");
				 mon = sc.nextInt();
				 System.out.println("Ingrese deposito: ");
				 deposit = sc.nextDouble();
				 cuentas[mon].acreditado(deposit);
				 break;
		case 2 : System.out.println("Seleccione de qué cuenta retirar saldo: ");
				 mon = sc.nextInt();
				 System.out.println("¿Cuánto desea retirar?");
				 deposit = sc.nextDouble();
				 cuentas[mon].retirar(deposit);
				 break;
		case 3 : System.out.println("Seleccione la cuenta para ver Saldo Actual: ");
				 mon = sc.nextInt();
				 cuentas[mon].saldoactual;
				 break;
		case 4 : System.out.println("¿Qué cuenta desea ver?");
        		 mon=sc.nextInt();
        		 cuentas[mon].mostrar();
        		 break;
		case 5 :
        		 System.out.println("¿A que cuenta se realizará la transferencia?");
                 mon=sc.nextInt();
                 System.out.println("Ingrese la cuenta donde se depositará: ");
                 mon2=sc.nextInt();
                 System.out.println("Ingrese cuánto quiere retirar.");
                 deposit=sc.nextDouble();
                 cuentas[mon].retirar(deposit);
                 cuentas[mon2].retirar(deposit);
                 break;
        default:
                System.out.println("- Opción Incorrecta -");
                break;
				 
		
		}
		
	
		
		
	}

}
