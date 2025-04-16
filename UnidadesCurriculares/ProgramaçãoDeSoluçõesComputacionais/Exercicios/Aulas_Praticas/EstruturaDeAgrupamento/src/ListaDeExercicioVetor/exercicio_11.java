package ListaDeExercicioVetor;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_11 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		int[] temperatura = new int[10];

		int soma = 0;
		double media = 0.0;

		int i;
		System.out.println("Digite uma temperatura: ");
		for (i = 0; i <temperatura.length; i++) {

			temperatura[i] = sc.nextInt();
			soma +=temperatura[i];
		}

		System.out.print("Os números armazenados no vetor são: [");
		for (i = 0; i < temperatura.length; i++) {
			System.out.print(temperatura[i]);

			if (i < temperatura.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
		media = (double) soma / temperatura.length;
		System.out.println("A temperatura média é: " + media);

		sc.close();

	}

}
