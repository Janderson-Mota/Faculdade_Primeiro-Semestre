package ListaDeExercicioVetor;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int[] vetor = new int[10];
		int contadorPrimo = 0;
		double soma = 0.0;

		System.out.println("Escreva 10 números: ");

		for (int i = 0; i < vetor.length; i++) {
			System.out.print((i + 1) + "º número: ");
			vetor[i] = sc.nextInt();
			soma += vetor[i];
		}

		System.out.println("\nNúmeros primos encontrados:");

		for (int i = 0; i < vetor.length; i++) {
			boolean primo = true;

			if (vetor[i] <= 1) {
				primo = false;
			} else {
				for (int j = 2; j < vetor[i]; j++) {
					if (vetor[i] % j == 0) {
						primo = false;
					}
				}
			}

			if (primo) {
				contadorPrimo++;
				System.out.println("Índice " + i + ": " + vetor[i] + " é primo.");
			}
		}

		System.out.println("\nTotal de números primos: " + contadorPrimo);
		System.out.println("Soma de todos os números: " + soma);

		sc.close();
	}
}