package ListaDeExercicio2;

import java.util.Locale;
import java.util.Scanner;

public class atividade_11 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor de X: ");
		double x = sc.nextDouble();

		System.out.print("Digite o valor de Y: ");
		double y = sc.nextDouble();

		System.out.print("Digite o valor de Z: ");
		double z = sc.nextDouble();

		if (x < y + z && y < x + z && z < x + y) {
			if (x == y && y == z) {
				System.out.println("Triângulo Equilátero.");
			} else if (x == y || x == z || y == z) {
				System.out.println("Triângulo Isósceles.");
			} else {
				System.out.println("Triângulo Escaleno.");
			}
		} else {
			System.out.println("Os valores informados não formam um triângulo.");
		}

		sc.close();

	}

}
