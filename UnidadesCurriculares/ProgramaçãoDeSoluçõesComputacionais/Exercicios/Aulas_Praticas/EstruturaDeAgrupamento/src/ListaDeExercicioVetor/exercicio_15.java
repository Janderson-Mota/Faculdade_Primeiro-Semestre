package ListaDeExercicioVetor;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_15 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos da sequência de Fibonacci: ");
        int n = sc.nextInt();

        int[] fibonacci = new int[n];

        if (n > 0) fibonacci[0] = 0;
        if (n > 1) fibonacci[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        System.out.print("Sequência de Fibonacci: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }

        sc.close();
    }
}