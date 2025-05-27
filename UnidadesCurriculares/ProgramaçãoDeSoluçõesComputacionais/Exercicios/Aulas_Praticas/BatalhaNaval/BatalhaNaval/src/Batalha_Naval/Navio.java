package Batalha_Naval;

public class Navio {
    private String nome;
    private int tamanho;
    private int vida;

    public Navio(String nome, int tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.vida = tamanho;
    }

    public void receberDano() {
        vida--;
    }

    public boolean estaAfundado() {
        return vida <= 0;
    }

    public String getNome() {
        return nome;
    }

    public int getTamanho() {
        return tamanho;
    }
}