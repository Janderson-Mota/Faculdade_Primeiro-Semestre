package ListaDeExercicioVetor;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_19 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] codigos = {101, 202, 303, 404, 505, 606};

        System.out.print("Digite o código do produto: ");
        int codigo = sc.nextInt();

        boolean encontrado = false;
        for (int i = 0; i < codigos.length; i++) {
            if (codigo == codigos[i]) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Produto encontrado no estoque.");
        } else {
            System.out.println("Produto não encontrado.");
        }

        sc.close();
    }
}