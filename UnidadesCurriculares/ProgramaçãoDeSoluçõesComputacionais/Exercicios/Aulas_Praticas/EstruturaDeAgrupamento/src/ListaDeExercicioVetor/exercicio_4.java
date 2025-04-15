package ListaDeExercicioVetor;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class exercicio_4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Random aleatorio = new Random();
		

		int[] vetor = new int[20];

		int i;
		for (i = 0; i < vetor.length; i++) {
			 vetor[i]= aleatorio.nextInt(31);
		}
		
		System.out.print("Os números armazenados no vetor são: [");
		for (i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i]);

			if (i < vetor.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	  
		
		for (i = 0; i < vetor.length; i++) {
		     if (vetor[i] == 25) {
		              System.out.println("O indice de número "+i+" armazena o número "+ vetor[i]);
		     }
		}

		sc.close();

	}

}
