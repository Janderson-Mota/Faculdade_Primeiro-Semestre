package ListaDeExercicioVetor;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class exercicio_3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Random aleatorio = new Random();

		int[] vetor = new int[10];
		
		int soma = 0;
		double media = 0.0;

		int i;
		for (i = 0; i < vetor.length; i++) {

			vetor[i] = aleatorio.nextInt(100);
			soma += vetor[i];
		}

		System.out.print("Os números armazenados no vetor são: [");
		for (i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i]);

			if (i < vetor.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	     media = (double) soma / vetor.length; 
		System.out.println("A média é: "+ media);

		sc.close();
		}
	}


