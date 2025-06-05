package HerançaPessoas;

public class Operario extends Empregado{
	
	public class Operario extends Funcionario {
	    private double valorProducao;
	    private double comissao;

	    public Operario(String nome, String cpf, String endereco, String telefone, String setor, double salarioBase, double valorProducao, double comissao) {
	        super(nome, cpf, endereco, telefone, setor, salarioBase);
	        this.valorProducao = valorProducao;
	        this.comissao = comissao;
	    }

	    @Override
	    public double calcularSalario() {
	        return salarioBase + (valorProducao * comissao);
	    }
	}
}
