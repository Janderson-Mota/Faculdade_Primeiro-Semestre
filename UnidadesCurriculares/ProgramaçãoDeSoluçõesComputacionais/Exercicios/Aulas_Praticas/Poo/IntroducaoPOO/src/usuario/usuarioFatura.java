package usuario;

import java.util.Scanner;

import administracao.Fatura;

public class usuarioFatura {

	public static void main(String[] args) {
		
		
	     Scanner sc = new Scanner(System.in);
	        
	        int numeroItem = 0;
			String descricao = "";
			int quantidadeComprada = 0;
			double unitario = 0.0;
			
			Fatura cliente = new Fatura();
			
			cliente.InicializarFatura(1480, "oi", 5, 1950);
	        System.out.println("Cliente 1: "+cliente.numeroItem+"   "+cliente.descricao+"   "+cliente.quantidadeComprada+"  "+cliente.unitario);
		     
	        System.out.println("Valor total da fatura: "+ cliente.calcular_valor_fatura());
		
		

	}

}
