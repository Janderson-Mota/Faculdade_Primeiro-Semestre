package HerançaPessoas;

public class Fornecedor extends Pessoas {

	private double valorCredito =0.0;
	private double valorDivida =0.0;
	
	

	public Fornecedor() { super(); }

	public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
		super(nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;

	}

	public Fornecedor(String nome, String telefone, double valorCredito, double valorDivida) {
		super(nome, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;

	}
	

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}

	public double saldo() {
		return valorCredito - valorDivida;
	}

}
