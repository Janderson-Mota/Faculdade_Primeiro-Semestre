package ListaDeExercicio;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int numero = sc.nextInt();
		int impares = 1;
		System.out.println("Os números ímpares de " + impares + " até " + numero + " são: ");

		while (numero >= impares) {

			System.out.println(impares);
			impares = impares + 2;

		}

		sc.close();
	}

}
