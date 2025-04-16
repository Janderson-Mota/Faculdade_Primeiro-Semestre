package ListaDeExercicioVetor;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_18 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double[] temperaturas = new double[8];

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Digite a temperatura " + (i + 1) + ": ");
            temperaturas[i] = sc.nextDouble();
        }

        double maior = temperaturas[0];
        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] > maior) {
                maior = temperaturas[i];
            }
        }

        System.out.printf("Maior temperatura registrada: %.2f°C%n", maior);

        sc.close();
    }
}