package ListaDeExercicio2;

import java.util.Locale;
import java.util.Scanner;

public class atividade_10 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.printf("Digite seu salário para verificarmos se você tem direito ao beneficio: R$ ");
		final double tetoSalarial = 1000.00;
		double salarioFuncionario = sc.nextDouble();
		double porcentagemReajuste = 0;
		double salarioReajustado;
		
		if (salarioFuncionario < tetoSalarial) {
			porcentagemReajuste = salarioFuncionario * 0.30;
			salarioReajustado= porcentagemReajuste +  salarioFuncionario;
			System.out.printf("Seu salário será reajustado para: R$ %.2f%n", salarioReajustado);
		}
		else {
			System.out.printf("Seu salário não será reajustado.");
		}
		
		sc.close();
	}

}
