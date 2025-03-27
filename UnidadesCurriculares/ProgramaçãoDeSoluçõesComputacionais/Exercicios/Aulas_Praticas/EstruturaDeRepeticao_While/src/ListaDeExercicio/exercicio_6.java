package ListaDeExercicio;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char genero = '.';
		double peso = 0.0;
		int pessoas = 1;
		int verificacaoPesoMasculino = 0;
		int verificacaoPesoFeminino = 0;

		while (pessoas <= 10) {
			
			
			System.out.println("Vocé é a pessoa de número " + pessoas);
			System.out.print("Digite seu sexo (F/M): ");
			genero = sc.next().charAt(0);
			

			if (genero == 'F' || genero == 'f') {

				System.out.println();
				String feminino = "feminino";
				System.out.println("Seu sexo é: " + feminino);

				System.out.print("Digite seu peso: ");
				peso = sc.nextDouble();
				System.out.println();

				if (peso >= 50 || peso <= 70) {
					verificacaoPesoFeminino = verificacaoPesoFeminino + 1;
				}
			}

			if (genero == 'M' || genero == 'm') {

				System.out.println();
				String masculino = "Masculinho";
				System.out.println("Seu sexo é: " + masculino);

				System.out.print("Digite seu peso: ");
				peso = sc.nextDouble();
				System.out.println();

				if (peso >= 60 || peso <= 80) {
					verificacaoPesoMasculino = verificacaoPesoMasculino + 1;
				}
			}
			pessoas++;
		}

		System.out.println("As mulheres dentro da faixa estipulada são: " + verificacaoPesoFeminino);
		System.out.println("Os homens dentro da faixa estipulada são: " + verificacaoPesoMasculino);

		sc.close();
	}
}
