package ListaDeExercicio2;

import java.util.Scanner;

public class atividade_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("===== CARDÁPIO =====");
		System.out.println("1 - Pizza");
		System.out.println("2 - Hambúrguer");
		System.out.println("3 - Salada");
		System.out.println("4 - Massa");
		System.out.println("====================");

		System.out.print("Escolha um prato (1 a 4): ");
		int escolha = sc.nextInt();

		switch (escolha) {
		case 1:
			System.out.println("Você escolheu Pizza.");
			break;
		case 2:
			System.out.println("Você escolheu Hambúrguer.");
			break;
		case 3:
			System.out.println("Você escolheu Salada.");
			break;
		case 4:
			System.out.println("Você escolheu Massa.");
			break;
		default:
			System.out.println("Opção inválida!");
			break;
		}

		sc.close();
	}
}