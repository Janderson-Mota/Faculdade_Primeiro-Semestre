package ListaDeExercicio2;

import java.util.Locale;
import java.util.Scanner;

public class atividade_7 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite sua idade para verificarmos qual cadegoria vc se encaixa: ");
		int idade = sc.nextInt();

		if (idade == 7) {
			System.out.println("Você faz parte categoria: INFANTIL");
		} else if (idade >= 8 && idade <= 10) {
			System.out.println("Você faz parte categoria: JUVENIL");
		} else if (idade >= 11 && idade <= 15) {
			System.out.println("Você faz parte categoria: ADOLECENTE");
		} else if (idade >= 16 && idade <= 30) {
			System.out.println("Você faz parte categoria: ADULTO");
		} else if (idade > 30) {
			System.out.println("Você faz parte categoria: SENIOR");
		} else {
			System.out.println("Você não faz parte de nenhuma categoria ainda");
		}

		sc.close();
	}

}
