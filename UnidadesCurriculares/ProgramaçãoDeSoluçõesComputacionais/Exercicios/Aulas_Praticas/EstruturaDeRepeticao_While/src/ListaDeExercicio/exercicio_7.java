package ListaDeExercicio;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_7 {


	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota = 1;
		double notaMaior = 1;
		double notaMenor = 100.000;
		int contador = 0;
		
		while (contador <= 4) {
			System.out.print("Digite uma nota: ");
			nota = sc.nextDouble();
			
			if(nota > notaMaior) {
				notaMaior = nota;
			}
			
			if(nota < notaMenor) {
				notaMenor = nota;
			}
			
			contador++;
		}
		
		System.out.println();
		System.out.println("A maior nota é: "+ notaMaior);
		System.out.println("A menor nota é: "+ notaMenor);
		
		
		sc.close();

	}

}
