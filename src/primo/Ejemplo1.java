package primo;

import java.util.Scanner;

public class Ejemplo1 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int numero = 0;

		System.out.println("Buenos dias usuario");
		System.out.println("Introduce un numero primo");
		numero = Integer.parseInt(ent.nextLine());

		System.out.println(isPrimo(numero) ? "El numero " + numero + " es primo" : "El numero " + numero + "");
		mostrarDivisores(numero);
	}

	public static boolean isPrimo(int numero) {
		if (numero < 2) {
			return false;
		}
		for (int i = 2; i * i <= numero; i++) {
			if (numero % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void mostrarDivisores(int numero) {
		String divisores = "";
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				divisores += i + ", ";
			}
		}
		System.out.println("Los divisores de " + numero + " son: " + divisores);
	}
}
