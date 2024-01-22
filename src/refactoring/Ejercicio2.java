package refactoring;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un numero:");
		int primerNumero = sc.nextInt();
		System.out.println("Escribe otro numero:");
		int segundoNumero = sc.nextInt();
		if (primerNumero > segundoNumero) {
			System.out.println("Error el primer número es mayor que el segundo");
		} else {
			System.out.println("Los números comprendidos entre " + primerNumero + " y " + segundoNumero + " son:");
			for (int i = primerNumero; i <= segundoNumero; i++) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}