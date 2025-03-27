package ListaDeExercicio;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número da matrícula: ");
		int matricula = sc.nextInt();
		System.out.println();

		double nota1, nota2, nota3 = 0;

		if (matricula >= 0) {
			while (matricula >= 0) {

				System.out.println("Dgite três notas para ser feito a média.");

				System.out.print("Nota 1: ");
				nota1 = sc.nextDouble();

				System.out.print("Nota 2: ");
				nota2 = sc.nextDouble();

				System.out.print("Nota 3: ");
				nota3 = sc.nextDouble();

				double media = nota1 + nota2 + nota3 / 3;
				System.out.println();
				System.out.printf("A média do aluno foi de:  %.2f%n", media);

				if (media >= 70) {
					System.out.println("Parabens você foi aprovado!");
				} else if (media >= 60) {
					System.out.println("Você está de recuperação!");
				} else {
					System.out.println("Reprovado!");
				}

				System.out.println();
				System.out.print("Digite o número da matrícula: ");
				matricula = sc.nextInt();
				System.out.println();

				if (matricula >= 0) {
					System.out.print("O número da matrícula é inválido."); 
				}
			}
		}

		else {
			System.out.print("O número da matrícula é inválido.");
		}
		sc.close();
	}
}
