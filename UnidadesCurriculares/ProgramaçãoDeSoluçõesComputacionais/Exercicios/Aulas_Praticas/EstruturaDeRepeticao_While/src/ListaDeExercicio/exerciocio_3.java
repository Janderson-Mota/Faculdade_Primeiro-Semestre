package ListaDeExercicio;

import java.util.Locale;
import java.util.Scanner;

public class exerciocio_3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double valores = 0;
		int contador = 1;

		while (contador <= 5) {

			System.out.print("Digite um número: ");
			valores = sc.nextDouble();
			double numero = valores * 2;
			System.out.println("O dobro do número digitado é: " + numero);
			System.out.println();
			contador++;

		}

		if (contador > 5) {
			System.out.println("Fim do programa.");
		}

		sc.close();

	}

}
