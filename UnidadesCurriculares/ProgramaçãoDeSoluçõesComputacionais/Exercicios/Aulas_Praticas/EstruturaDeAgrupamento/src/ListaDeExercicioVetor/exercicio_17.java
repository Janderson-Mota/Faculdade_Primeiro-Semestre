package ListaDeExercicioVetor;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_17 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[10];
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }

        double media = soma / notas.length;
        System.out.printf("Média das notas: %.2f%n", media);

        sc.close();
    }
}