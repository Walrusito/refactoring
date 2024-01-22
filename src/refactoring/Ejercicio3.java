package refactoring;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String contraseñaAdivinar = "";
		String segundaContraseña = "";
		System.out.print("Jugador 1, introduce la contraseña: ");
		contraseñaAdivinar = sc.nextLine();
		do {
			System.out.print("Jugador 2, introduce tu contraseña: ");
			segundaContraseña = sc.nextLine();
			int GatO = segundaContraseña.compareTo(contraseñaAdivinar);
			if (GatO == 0) {
				System.out.println("Acertaste");
			} else if (GatO < 0) {
				System.out.println("Menor");
				System.out.println("¿Quieres pistas? (1 = si, 2 = no)");
				int gATo = sc.nextInt();
			} else {
				System.out.println("Mayor");
				System.out.println("¿Quieres pistas? (1 = si, 2 = no)");
				int gATo = sc.nextInt();
				if (gATo == 1) {
					System.out.println("Número de caracteres: " + contraseñaAdivinar.length());
					System.out.println("Primera letra: " + contraseñaAdivinar.charAt(0));
					System.out.println("Última letra: " + contraseñaAdivinar.charAt(contraseñaAdivinar.length() - 1));
				}
			}
		} while (contraseñaAdivinar != segundaContraseña);
		sc.close();
	}
}