package ListaDeExercicios;
import java.util.Scanner;

public class Atividade_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int X, Y, PROD;

		X = sc.nextInt();
		Y = sc.nextInt();

		PROD = (X * Y);
		System.out.println("PROD = " + PROD);

		sc.close();

	}

}