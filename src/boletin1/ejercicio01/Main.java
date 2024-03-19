package boletin1.ejercicio01;

import java.util.Scanner;

public class Main {

	public class Principal {

		public static void main(String[] args) {
			CuentaCorriente c1 = new CuentaCorriente("12345678Z", 5);
			CuentaCorriente c2 = new CuentaCorriente("11111111H", 100);
			
			c1.setNombre("Pepe");
			c1.datosCuenta();
			System.out.println();
			
			c1.incrementarDinero(500);
			c1.datosCuenta();
			
			c1.sacarDinero(200);
			c1.datosCuenta();
			
			if(c1.sacarDinero(400)) {
				System.out.println("Se ha sacado dinero correctamente");
			} else {
				System.out.println("No hay saldo suficiente");
			}
			
			System.out.println(((CuentaCorriente) c1).getSaldo());
			

			System.out.println(c1);
		}

	}

}
