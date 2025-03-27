package ListaDeExercicio;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_8 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int idade = 0;
		int mediaIdade = 0;
		double peso = 0.0;
		int quantidadePessoasComPeso = 0;
		int contadorPessoas = 1;

		while (contadorPessoas <= 7) {

			System.out.println("Você é a pessoa de número " + contadorPessoas);
		

			System.out.print("Digite sua idade: ");
			idade = sc.nextInt();

			System.out.print("Digite seu peso: ");
			peso = sc.nextDouble();
			System.out.println();

			if (peso >= 90) {
				quantidadePessoasComPeso = quantidadePessoasComPeso + 1;
			}

			mediaIdade = mediaIdade + idade;
			contadorPessoas++;
		}

		mediaIdade = mediaIdade / contadorPessoas;
		System.out.println("A média de idades das 7 pessoas é: " + mediaIdade);
		System.out.println("A quantidade de pessoas acima do peso proposto é de: " + quantidadePessoasComPeso);

		sc.close();

	}

}
