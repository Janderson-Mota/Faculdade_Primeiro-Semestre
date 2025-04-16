package ListaDeExercicioVetor;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_16 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] respostas = new int[5];

        for (int i = 0; i < respostas.length; i++) {
            System.out.print("Digite a resposta " + (i + 1) + ": ");
            respostas[i] = sc.nextInt();
        }

        System.out.print("Respostas na ordem inversa: ");
        for (int i = respostas.length - 1; i >= 0; i--) {
            System.out.print(respostas[i] + " ");
        }

        sc.close();
    }
}