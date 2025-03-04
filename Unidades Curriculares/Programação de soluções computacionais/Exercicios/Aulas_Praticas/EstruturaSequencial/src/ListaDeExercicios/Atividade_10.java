package ListaDeExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Atividade_10 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

		double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        final double pi = 3.14159;
       
        double areaTriangulo = (A * C) / 2.0;
        double areaCirculo = pi * (C * C);
        double areaTrapezio = ((A + B) * C) / 2.0;
        double areaQuadrado = B * B;
        double areaRetangulo = A * B;

        System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
        System.out.printf("CIRCULO: %.3f%n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f%n", areaRetangulo);

        sc.close();
	}
}