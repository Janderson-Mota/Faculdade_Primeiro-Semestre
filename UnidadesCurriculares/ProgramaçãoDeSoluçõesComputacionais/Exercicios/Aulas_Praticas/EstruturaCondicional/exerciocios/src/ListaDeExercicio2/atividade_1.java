package ListaDeExercicio2;

import java.util.Locale;
import java.util.Scanner;

public class atividade_1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de maças que irá comprar: ");
		int quantidadeMacas = sc.nextInt();
		double macas = 0;
		double total = 0;

		if (quantidadeMacas <= 12) {

			macas = 1.30;
			total = quantidadeMacas * macas;
			System.out.printf("O total a pagar será de R$ %.2f%n ", total);
		}

		else {
			macas = 1.00;
			total = quantidadeMacas * macas;
			System.out.printf("O total a pagar será de R$ %.2f%n ", total);
		}

		sc.close();

	}

}
