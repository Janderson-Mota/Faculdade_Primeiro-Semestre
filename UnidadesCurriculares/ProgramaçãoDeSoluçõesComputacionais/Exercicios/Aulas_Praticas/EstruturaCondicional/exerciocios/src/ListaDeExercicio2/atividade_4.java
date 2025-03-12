package ListaDeExercicio2;

import java.util.Locale;
import java.util.Scanner;

public class atividade_4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os dados para termos a pontuação do aço: ");

		System.out.print("Digite os dados da dureza: ");
		double dureza = sc.nextDouble();

		System.out.print("Digite os dados do teor de carvão: ");
		double teorCarvao = sc.nextDouble();

		System.out.print("Digite os dados da resitência da tração: ");
		double resitenciaTracao = sc.nextDouble();

		System.out.println("  ");
		if (dureza > 50 && teorCarvao < 0.7 && resitenciaTracao > 5600) {
			System.out.println("A pontuação do aço é 10");
		} else if (dureza > 50 && teorCarvao < 0.7) {
			System.out.println("A pontuação do aço é 9");
		} else if (teorCarvao < 0.7 && resitenciaTracao > 5600) {
			System.out.println("A pontuação do aço é 8");
		} else if (dureza > 50 && resitenciaTracao > 5600) {
			System.out.println("A pontuação do aço é 7");
		} else if (dureza > 50 || teorCarvao < 0.7 || resitenciaTracao > 5600) {
			System.out.println("A pontuação do aço é 6");
		} else {
			System.out.println("A pontuação do aço é 5");
		}

		sc.close();
	}

}
