package ListaDeExercicio2;

import java.util.Locale;
import java.util.Scanner;

public class atividade_3_ternario {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número da conta: ");
		int numeroConta = sc.nextInt();

		System.out.print("Digite o saldo do da sua conta: ");
		double saldoCliente = sc.nextDouble();

		System.out.print("Digite seu débito: ");
		double debito = sc.nextDouble();

		System.out.print("Digite seu crédito: ");
		double credito = sc.nextDouble();

		double saldoAtual = saldoCliente - debito + credito;
		String mensagem = (saldoAtual < 0) ? "Saldo negativo!" : "Saldo positivo!";

		System.out.println(mensagem);

		sc.close();
	}

}
