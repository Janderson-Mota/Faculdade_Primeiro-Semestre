package ListaDeExercicios;
import java.util.Scanner; 
import java.util.Locale;

public class Atividade_8 {

	    public static void main(String[] args) {
			
	    	Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			int codigoPeca1 = sc.nextInt();
			int quantidadePeca1 = sc.nextInt();
			double valor1 = sc.nextDouble();
			
			System.out.println("");
			
			int codigoPeca2 = sc.nextInt();
			int quantidadePeca2 = sc.nextInt();
			double valor2 = sc.nextDouble();
			
			
			double total = (valor1 * quantidadePeca1) + (valor2 * quantidadePeca2);
			System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
			sc.close();
			
	
		}
	
}