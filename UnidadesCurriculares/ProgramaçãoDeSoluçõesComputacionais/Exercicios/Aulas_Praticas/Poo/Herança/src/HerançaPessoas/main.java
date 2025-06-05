package HerançaPessoas;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//fornecedor 
		
		System.out.println("Teste classe fornecedor\n");

		Funcionario empresa_1 = new Funcionario("Cemig", "(31) 98345-7470", "R. Você é bobo, nº 0", 5000.00, 4000.00);

		System.out.println("Nome: " + empresa_1.getNome() + "\nTelefone: " + empresa_1.getTelefone() + "\nEndereco: "
				+ empresa_1.getEndereco() + "\nValor Credito: " + empresa_1.getValorCredito() + "\nValor Divida: "
				+ empresa_1.getValorDivida());
		
		System.out.println("\nSaldo Final: " + empresa_1.saldo());

	}

}
