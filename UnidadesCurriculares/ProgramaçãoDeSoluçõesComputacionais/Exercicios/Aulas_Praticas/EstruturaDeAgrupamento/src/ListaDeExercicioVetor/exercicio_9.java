package ListaDeExercicioVetor;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class exercicio_9 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Random aleatorio = new Random();
		
		System.out.print("Digite a quantidade de recibos desejada: ");
        int recibos = sc.nextInt();
        int[] vetor = new int[recibos];

        int contador = 0;

        while (contador < vetor.length) {
            vetor[contador] = contador + 1; 
            contador++;
        }

        System.out.println("\nRecibos gerados:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Recibo número " + (i + 1) + " - valor: " + vetor[i]);
        }

        sc.close();
    }
}
