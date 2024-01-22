package refactoring;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un numero:");
		int noviembre = sc.nextInt();
		int Suma = 0;
		for (int i = noviembre; i > 0; i--) {
			if (i % 2 == 0) {
				Suma = Suma + i;
			}
		}
		System.out.println("La suma de los numeros pares son " + Suma);
		Suma = 0;
		for (int i = noviembre; i > 0; i--) {
			if (i % 2 != 0) {
				Suma = Suma + i;
			}
		}
		System.out.println("La suma de los numeros impares son " + Suma);
	}
}