package ListaDeExercicio2;

import java.util.Locale;
import java.util.Scanner;

public class atividade_6_Ternario {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		final int maiorIdade = 18;
		System.out.print("Digite sua idade para a verificação: ");
		double idade = sc.nextDouble();

		String mensagem = (idade >= maiorIdade) ? "Você é maior de idade segundo a legislação brasileira"
				: "Você não é maior de idade segundo a legislação brasileira";

		System.out.println(mensagem);
		sc.close();
	}

}
