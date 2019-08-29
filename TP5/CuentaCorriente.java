import java.util.Random;

public class CuentaCorriente {
	
	Random rd=new Random();
	private double saldo;
	private String nombreTitular;
	private long numeroCuenta = rd.nextInt()*100;
	
	void Cuentas(String nombre, double inicial, long numeroCuenta ) {
		this.nombreTitular = nombre;
		this.saldo = inicial;
		this.numeroCuenta = numeroCuenta;
		
	}
	
	public void acreditado (double credito) {
		this.saldo+=credito;
		System.out.println("Ahora posee" + this.saldo + "acreditado.");
	}
	public void retirar (double cantidad) {
		this.saldo = cantidad;
		System.out.println("Usted tiene" + this.saldo + "de saldo restante.");
	}
	
	public void mostrar() {
		System.out.println("Titular: ");
		System.out.println(this.nombreTitular);
		
		System.out.println("Saldo en la Cuenta: ");
		System.out.println(this.saldo);
		
		System.out.println("Nro. de Cuenta: ");
		System.out.println(this.numeroCuenta);
	}
	
	public void setTitular(String Titular) 	{
		this.nombreTitular = Titular;
	}
	
	public String getTitular() {
		return this.nombreTitular;
	}
	
	public void setSaldo(double Saldo) {
		this.saldo = Saldo;
	}
	
	public double getSaldo() {
		return this.saldo = Saldo;
	}
	public long getNroCuenta() {
		return this.numeroCuenta;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
