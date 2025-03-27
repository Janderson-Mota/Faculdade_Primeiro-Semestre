package ListaDeExercicio;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int temperatura = 0;
		int contador = 0;
		double mediaTemperatura = 0;

		while (contador >= 0 && contador <= 9) {

			System.out.print("Digite uma temperatura: ");
			temperatura = sc.nextInt();
			System.out.println();

			contador++;
			mediaTemperatura = mediaTemperatura + temperatura;

		}

		mediaTemperatura = mediaTemperatura / contador;
		System.out.println("A média das temperaturas é: " + mediaTemperatura);

		sc.close();
	}

}
