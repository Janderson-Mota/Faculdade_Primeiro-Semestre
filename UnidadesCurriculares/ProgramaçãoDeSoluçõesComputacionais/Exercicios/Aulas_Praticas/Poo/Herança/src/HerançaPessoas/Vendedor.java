package HerançaPessoas;

public class Vendedor extends Empregado{
	
	    private double valorVendas;
	    private double comissao;

	    public Vendedor(String nome, String cpf, String endereco, String telefone, String setor, double salarioBase, double valorVendas, double comissao) {
	        super(nome, cpf, endereco, telefone, setor, salarioBase);
	        this.valorVendas = valorVendas;
	        this.comissao = comissao;
	    }

	    @Override
	    public double calcularSalario() {
	        return salarioBase + (valorVendas * comissao);
	    
	}
}
