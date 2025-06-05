package HerançaPessoas;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		        Operario operario = new Operario("João", "123456789", "Rua A", "99999-9999", "Produção", 1500, 20000, 0.05);
		        Vendedor vendedor = new Vendedor("Ana", "987654321", "Rua B", "98888-8888", "Vendas", 1200, 30000, 0.10);
		        Administrador admin = new Administrador("Carlos", "1122334455", "Rua C", "97777-7777", "Administração", 2500, "500");

		        System.out.println("Salário do Operário: R$ " + operario.calcularSalario());
		        System.out.println("Salário do Vendedor: R$ " + vendedor.calcularSalario());
		        System.out.println("Salário do Administrador: R$ " + admin.calcularSalario());
		   
	

	}

}
