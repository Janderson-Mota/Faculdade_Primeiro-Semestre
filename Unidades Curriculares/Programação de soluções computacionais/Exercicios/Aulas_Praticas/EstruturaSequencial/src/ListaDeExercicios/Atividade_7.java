package ListaDeExercicios;
import java.util.Scanner; 
import java.util.Locale;

public class Atividade_7 {

	    public static void main(String[] args) {
			
	    	Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			String nome = sc.next();
			double salarioFixo = sc.nextDouble();
			double totalVendas = sc.nextDouble();
			
		    double totalSalario = salarioFixo + ((totalVendas * 15) / 100);
		    System.out.printf("TOTAL = R$ %.2f%n", totalSalario);
		
			sc.close();
			
	
		}
	
}