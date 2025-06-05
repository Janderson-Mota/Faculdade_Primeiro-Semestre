package HerançaPessoas;

public class Operario extends Empregado{
	
	    private double valorProducao;
	    private double comissao;

	    public Operario(String nome, String cpf, String endereco, String telefone, String setor, double salarioBase, double valorProducao, double comissao) {
	        super(nome, cpf, endereco, telefone, setor, salarioBase);
	        this.valorProducao = valorProducao;
	        this.comissao = comissao;
	    }

	   
	    public double calcularSalario() {
	        return salarioBase + (valorProducao * comissao);
	    
	}
}
