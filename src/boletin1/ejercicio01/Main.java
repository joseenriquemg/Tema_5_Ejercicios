package boletin1.ejercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String nombre = "";
		
		String dni = "";
		
		int saldo;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca su nombre:");
		
		nombre = sc.nextLine();
		
		System.out.println("Introduzca su DNI:");
		
		dni = sc.nextLine();
		
		System.out.println("Introduzca su saldo actual: ");
		
		saldo = sc.nextInt();

	}

}
