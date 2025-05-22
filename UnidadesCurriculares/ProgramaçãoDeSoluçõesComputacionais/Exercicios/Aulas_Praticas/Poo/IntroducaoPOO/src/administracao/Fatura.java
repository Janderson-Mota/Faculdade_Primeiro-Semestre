package administracao;

public class Fatura {

	public int numeroItem = 0;
	public String descricao = "";
	public int quantidadeComprada = 0;
	public double unitario = 0.0;

	public void InicializarFatura(int numeroItem, String descricao, int quantidadeComprada, double unitario) {

		this.numeroItem = numeroItem;
		this.descricao = descricao;

		if (quantidadeComprada < 0) {
			quantidadeComprada = 0;
			this.quantidadeComprada = quantidadeComprada;
		} else {
			this.quantidadeComprada = quantidadeComprada;
		}

		if (unitario < 0.0) {
			unitario = 0.0;
			this.unitario = unitario;

		} else {
			this.unitario = unitario;
		} 

	}

	public double calcular_valor_fatura() {
		return quantidadeComprada * (int) unitario;
	}

}
