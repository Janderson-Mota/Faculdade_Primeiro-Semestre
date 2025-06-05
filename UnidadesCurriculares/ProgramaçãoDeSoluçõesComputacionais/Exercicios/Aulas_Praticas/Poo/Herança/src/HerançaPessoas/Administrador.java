package HerançaPessoas;

public class Administrador extends Empregado{

	 private String ajudaDeCusto;

	    public Administrador(String nome, String cpf, String endereco, String telefone, String setor, double salarioBase, String ajudaDeCusto) {
	        super(nome, cpf, endereco, telefone, setor, salarioBase);
	        this.ajudaDeCusto = ajudaDeCusto;
	    }

	    @Override
	    public double calcularSalario() {
	        return salarioBase + Double.parseDouble(ajudaDeCusto);
	    }

	    public String getAjudaDeCusto() {
	        return ajudaDeCusto;
	    }
	}
}
