package ListaDeExercicioVetor;
import java.util.Scanner;

public class exercicio_13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro N: ");
        int N = sc.nextInt();

        System.out.println("\nNúmeros primos até " + N + ":");
        for (int i = 2; i <= N; i++) {
            if (ehPrimo(i)) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }


    public static boolean ehPrimo(int num) {
        if (num <= 1) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}