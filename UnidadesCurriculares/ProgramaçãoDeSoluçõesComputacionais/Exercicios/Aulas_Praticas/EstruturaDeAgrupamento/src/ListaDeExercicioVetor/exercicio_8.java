package ListaDeExercicioVetor;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class exercicio_8 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Random aleatorio = new Random();

		int[] vetorA = new int[15];
		int[] vetorB = new int[15];

		int i;
		for (i = 0; i < vetorA.length; i++) {
			vetorA[i] = aleatorio.nextInt(16);
		}
        int j;

        for (i = 0, j = vetorA.length - 1; i < vetorA.length; i++, j--) {
            vetorB[j] = vetorA[i];
        }

		System.out.print("Os números armazenados no vetor A são: [");
		for (i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i]);

			if (i < vetorA.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");

		System.out.print("Os números armazenados no vetor B são: [");
		for (i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i]);

			if (i < vetorB.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");

		sc.close();

	}

}
