package ListaDeExercicioVetor;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_10 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		System.out.print("Digite um número para ver a tabuada: ");
		int numero = sc.nextInt();

		int[] tabuada = new int[10];

		for (int i = 0; i < tabuada.length; i++) {
			tabuada[i] = numero * (i + 1);
		}

		System.out.println("\nTabuada do " + numero + ":");
		for (int i = 0; i < tabuada.length; i++) {
			System.out.println(numero + " x " + (i + 1) + " = " + tabuada[i]);
		}

		sc.close();
	}
}
