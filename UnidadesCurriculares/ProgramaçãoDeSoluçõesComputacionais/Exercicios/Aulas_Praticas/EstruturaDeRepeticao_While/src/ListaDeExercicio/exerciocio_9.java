package ListaDeExercicio;

import java.util.Locale;
import java.util.Scanner;

public class exerciocio_9 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	        int soma = 0;
	        int contador = 0;

	        while (contador < 75) {
	            System.out.print("Digite um número inteiro e positivo: ");
	            int numero = sc.nextInt();

	            if (numero > 0) {
	                soma += numero;
	                contador++;
	            } else {
	                System.out.println("Por favor, digite apenas números inteiros e positivos.");
	            }
	        }

	        double media = (double) soma / contador;
	        System.out.println("Quantidade de números lidos: " + contador);
	        System.out.println("Média dos valores: " + media);

		
		sc.close();
	}

}
