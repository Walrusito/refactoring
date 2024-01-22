package refactoring;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe una frase:");
		String frase = sc.nextLine();
		String fraseInvertida = "";
		int numLetras = frase.length();
		for (int i = numLetras - 1; i >= 0; i--) {
			fraseInvertida = fraseInvertida + "" + frase.charAt(i);
		}
		System.out.println(fraseInvertida);
		sc.close();
	}
}