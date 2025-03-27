package ListaDeExercicio;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int incremento = 0;

		double totalSalario = 0;
		double totalFilhos = 0;

		double salarios = 0;
		int filhos = 0;

		double mediaSalario = 0;
		double mediaFilhos = 0;

		while (salarios >= 0) {

			System.out.print("Digite o números de filhos que vocês tem: ");
			filhos = sc.nextInt();
			System.out.print("Digite o seu salário: ");
			salarios = sc.nextDouble();
			System.out.println();

			incremento = incremento + 1;
			totalSalario = totalSalario + salarios;
			totalFilhos = totalFilhos + filhos;
			
			mediaFilhos = totalFilhos / incremento;
			mediaSalario = totalSalario / incremento;
			
			System.out.println(mediaFilhos+"   "+ mediaSalario);
		}


		System.out.println("A média dos filhos é de: " + mediaFilhos);
		System.out.println("A média dos salários é de: " + mediaSalario);

		
		sc.close();
	}
}
