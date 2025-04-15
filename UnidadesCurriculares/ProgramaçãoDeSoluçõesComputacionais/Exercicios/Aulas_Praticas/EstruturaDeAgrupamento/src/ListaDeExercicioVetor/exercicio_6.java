package ListaDeExercicioVetor;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class exercicio_6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Random aleatorio = new Random();

		int[] vetor = new int[30];

		int i;
		for (i = 0; i < vetor.length; i++) {
			vetor[i] = aleatorio.nextInt(101);
		}

		System.out.print("Os números armazenados no vetor são: [");
		for (i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i]);

			if (i < vetor.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");

		System.out.print("Digite um número para ser removido do vetor: ");
		int removerNumero = sc.nextInt();

		for (i = 0; i < vetor.length; i++) {
			if (vetor[i] == removerNumero) {
				vetor[i] = 0;
			}
		}

		System.out.println();
		System.out.print("Atualizados os números armazenados no vetor: [");
		for (i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i]);

			if (i < vetor.length - 1) {
				System.out.print(", ");
			}
		}

		sc.close();
	}

}
