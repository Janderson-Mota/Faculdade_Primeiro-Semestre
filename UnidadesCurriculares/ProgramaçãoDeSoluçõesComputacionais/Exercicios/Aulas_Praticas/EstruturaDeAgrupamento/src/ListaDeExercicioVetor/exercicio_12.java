package ListaDeExercicioVetor;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_12 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		int[] estoque = new int[26];
		int numero = 0;

		int i = 0;
		for (i = 1; i < estoque.length; i++) {

			estoque[i] = (numero);
			numero += 2;
		}

		System.out.print("Os números pares de 1 a 50 são: [");
		for (i = 1; i < estoque.length; i++) {
			System.out.print(estoque[i]);

			if (i < estoque.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");


		sc.close();
	}

}
