package ListaDeExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Atividade_6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

    	int numeroFuncionario = sc.nextInt();
		int	horasTrabahadas = sc.nextInt();
		double valorHorasFuncionario= sc.nextDouble();
		
		double salarioFuncionario = (horasTrabahadas * valorHorasFuncionario);
		
     	System.out.println("NUMBER = " + numeroFuncionario);
		System.out.printf("SALARY = U$ %.2f%n", salarioFuncionario);
		

		sc.close();
	}
}