package ListaDeExercicio2;

import java.util.Locale;
import java.util.Scanner;

public class atividade_5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		final double salarioMinimo = 1200;
		System.out.print("Digite seu salário para saber se está recebendo o mínimo: ");
		double salario = sc.nextDouble();

		if (salario >= salarioMinimo) {
			System.out.println("Você está recebendo um salário mínimo");
		} else {
			System.out.println("Você não está recebendo um salário mínimo");
		}

		sc.close();
	}

}
