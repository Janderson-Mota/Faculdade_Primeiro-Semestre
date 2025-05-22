package ListaDeExercicioVetor;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_14 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de etapas de produção: ");
        int n = sc.nextInt();

        int[] etapas = new int[n];
        
        int tempoPorEtapa = 5;
        int tempoTotal = 0;

        for (int i = 0; i < n; i++) {
            etapas[i] = tempoPorEtapa;
            tempoTotal += etapas[i];
        }

        System.out.println("Tempo total de produção: " + tempoTotal + " minutos");

        sc.close();
    }
}
