package ListaDeExercicioVetor;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class exercicio_20 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double[] precos = new double[10];

        for (int i = 0; i < precos.length; i++) {
            System.out.print("Digite o preço do produto " + (i + 1) + ": ");
            precos[i] = sc.nextDouble();
        }

        Arrays.sort(precos);

        System.out.println("Preços ordenados em ordem crescente:");
        for (double preco : precos) {
            System.out.printf("%.2f ", preco);
        }

        sc.close();
    }
}