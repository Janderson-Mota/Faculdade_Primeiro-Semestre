package ListaDeExercicio2;

import java.util.Locale;
import java.util.Scanner;

public class atividade_8 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("1-Somar  ");
		System.out.print("2-Subtrair  ");
		System.out.print("3-Multiplicar  ");
		System.out.print("4-Dividir  ");
		System.out.println("5-Sair  ");

		double resultado = 0;

		System.out.print("Digite o codigo referente ao calculo desejado: ");
		int codigo = sc.nextInt();

		if (codigo >= 1 && codigo <= 4) {

			System.out.println("   ");
			System.out.print("Digite um número: ");
			double x = sc.nextDouble();

			System.out.print("Digite outro número: ");
			double y = sc.nextDouble();
			System.out.println("   ");

			switch (codigo) {

			case 1:
				resultado = x + y;
				break;

			case 2:
				resultado = x - y;
				break;

			case 3:
				resultado = x * y;
				break;

			case 4:
				resultado = x / y;
				break;

			default:
				break;

			}

			System.out.println("   ");
			System.out.printf("Resultado: %.2f%n", resultado);

		} else if (codigo == 5) {
			System.out.println("   ");
			System.out.println("Programa encerrado!");

		} else {
			System.out.println("   ");
			System.out.println("Número inválido!");
		}

		sc.close();
	}
}
