package ListaDeExercicioVetor;

import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class exercicio_2 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Random aleatorio = new Random();

		int[] vetor1 = new int[10];
		int[] vetor2 = new int[10];
		int[] intercalado = new int[20];

		int i = 0;
		for (i = 0; i < vetor1.length; i++) {
			vetor1[i] = aleatorio.nextInt(21);
			vetor2[i] = aleatorio.nextInt(21);
		}

		System.out.print("Vetor 1: [");
		for (i = 0; i < vetor1.length; i++) {
			System.out.print(vetor1[i]);

			if (i < vetor1.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");

		System.out.print("Vetor 2: [");
		for (i = 0; i < vetor1.length; i++) {
			System.out.print(vetor2[i]);

			if (i < vetor1.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
		
		int index =0;
		for (i = 0; i < 10; i++) {
			intercalado[index++]= vetor1[i];
			intercalado[index++]= vetor2[i];
		}
		
		System.out.print("Vetor Intercalado: [");
        for (i = 0; i < 20; i++) {
            System.out.print(intercalado[i]);
            
            if (i < intercalado.length - 1) {
				System.out.print(", ");
			}
        }
        System.out.println("]");

		
		
		

		sc.close();
	}

}
