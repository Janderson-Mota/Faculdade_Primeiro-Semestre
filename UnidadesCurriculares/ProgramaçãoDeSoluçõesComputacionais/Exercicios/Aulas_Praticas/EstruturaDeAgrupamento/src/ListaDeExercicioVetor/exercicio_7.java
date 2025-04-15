package ListaDeExercicioVetor;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class exercicio_7 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Random aleatorio = new Random();

		int[] vetor = new int[5];
        int numeroMaior = 0;
        int numeroMenor = 100000;
		
		int i;
		for (i = 0; i < vetor.length; i++) {
	        
			vetor[i] = aleatorio.nextInt(51);
			
			if(vetor[i] > numeroMaior) {
				numeroMaior = vetor[i];
			}
			
			if(vetor[i] < numeroMenor) {
				numeroMenor = vetor[i];
			}
			
		}
		
		System.out.print("Os números armazenados no vetor são: [");
		for (i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i]);

			if (i < vetor.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
		
		System.out.println();
		System.out.println("A maior nota é: "+ numeroMaior);
		System.out.println("A menor nota é: "+ numeroMenor);
		

		sc.close();

	}

}
