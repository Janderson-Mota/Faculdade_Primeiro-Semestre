package ListaDeExercicio2;

import java.util.Locale;
import java.util.Scanner;

public class atividade_6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		final int maiorIdade = 18;
		System.out.print("Digite sua idade para a verificação: ");
		double idade = sc.nextDouble();

		if (idade >= maiorIdade) {
			System.out.println("Você é maior de idade segundo a legislação brasileira");
		} else {
			System.out.println("Você não é maior de idade segundo a legislação brasileira");
		}

		sc.close();
	}

}
