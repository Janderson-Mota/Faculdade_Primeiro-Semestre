package HerançaPessoas;

public class Pessoas {
 
	private String nome = "";
	private String endereco = "";
	private String telefone = "";
	
	
	public Pessoas() {}
	
	public Pessoas(String nome, String telefone) {
		
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = "";
	}

	public Pessoas(String nome, String endereco, String telefone) {
		
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
		
	
	
	
	
}
