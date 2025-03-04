package ListaDeExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Atividade_9 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double raio = sc.nextDouble();
		double volume;
		final double pi = 3.14159;

		volume = pi * ((4.0 / 3.0) * (raio * raio * raio));

		System.out.printf("VOLUME = %.3f%n", volume);

		sc.close();
	}
}
