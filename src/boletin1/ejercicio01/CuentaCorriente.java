package boletin1.ejercicio01;

public class CuentaCorriente {
	
	
	private String dni;
	
	
	private String nombre;
	
	
	private int saldo;
	
	
	public CuentaCorriente ( String dniTitular, int saldoInicial) {
		
		if ( dniTitular != null && !dniTitular.equals(""))
		this.dni = dniTitular;
		
		if ( saldoInicial >= 0)
		this.saldo = saldoInicial;
	}
	
	public CuentaCorriente ( String dni, String nombre, int saldoInicial) {
		
		if ( dni != null && !dni.equals(""))
		this.dni = dni;
		
		if ( nombre != null && !nombre.equals(""))
		this.nombre = nombre;
		
		if ( saldoInicial >= 0)
		this.saldo = saldoInicial;
	}
	
	public boolean sacarDinero (double cantidad) {
		boolean hayDinero = false;
		
		if ( this.saldo >= cantidad) {
			hayDinero = true;
		}
		
		return hayDinero;
	}
	
	public double incrementarDinero (double incremento) {
		
		double cantidadFinal;
		
		cantidadFinal = saldo + incremento;
		
		return cantidadFinal;
	}
	
	public void datosCuenta () {
		
		System.out.println("Titular de la cuenta: " + this.nombre);
		
		System.out.println("Dni titular: " + this.dni);
		
		System.out.println("Saldo total: " + this.saldo);
	}
	
	
	
	
	
	

}
