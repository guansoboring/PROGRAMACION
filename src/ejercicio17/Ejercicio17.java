package ejercicio17;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio17 {
	public static boolean Primo(int a) {
		if (a == 1) {
			return false;
		}

		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner name = new Scanner(System.in);
		System.out.println("Introduce un número");
		int numero = name.nextInt();

		if (Primo(numero)) {
			System.out.println("Primo");
		} else {
			System.out.println("No primo");
		}

	}

}
