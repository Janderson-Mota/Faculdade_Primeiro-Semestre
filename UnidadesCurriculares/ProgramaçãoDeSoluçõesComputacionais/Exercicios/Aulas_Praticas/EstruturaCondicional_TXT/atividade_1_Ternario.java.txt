package ListaDeExercicio2;

import java.util.Locale;
import java.util.Scanner;


public class atividade_1_Ternario {
    public static void main(String[] args) {
    	
    	Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o número de maçãs compradas: ");
        int quantidade = scanner.nextInt();

        
        double precoPorMaca = (quantidade >= 12) ? 1.00 : 1.30;
        double custoTotal = quantidade * precoPorMaca;

        System.out.printf("Custo total da compra: R$ %.2f%n", custoTotal);

        scanner.close();
    }
}