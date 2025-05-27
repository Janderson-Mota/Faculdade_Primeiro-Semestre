package Batalha_Naval;

import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Jogador {
    private String nome;
    private Tabuleiro tabuleiro;
    private List<Navio> navios;
    private int pontuacao = 0;

    public Jogador(String nome, int tamanho, List<Navio> navios) {
        this.nome = nome;
        this.tabuleiro = new Tabuleiro(tamanho);
        this.navios = navios;
        posicionarNavios();
    }

    private void posicionarNavios() {
        for (Navio navio : navios) {
            while (!tabuleiro.adicionarNavio(navio)) {}
        }
    }

    public boolean jogar(Jogador oponente, Scanner sc, boolean isHumano) {
        int linha, coluna;
        if (isHumano) {
            System.out.println("🔎 " + nome + ", digite as coordenadas (linha e coluna): ");
            linha = sc.nextInt();
            coluna = sc.nextInt();
        } else {
            Random rand = new Random();
            linha = rand.nextInt(oponente.getTabuleiro().getTamanho());
            coluna = rand.nextInt(oponente.getTabuleiro().getTamanho());
            System.out.println("🤖 " + nome + " atacou (" + linha + ", " + coluna + ")");
        }

        boolean acertou = oponente.tabuleiro.atacar(linha, coluna);
        if (acertou) {
            System.out.println("🔥 Acertou!");
            pontuacao++;
        } else {
            System.out.println("🌊 Errou!");
        }
        return acertou;
    }

    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }

    public String getNome() {
        return nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public boolean perdeu() {
        return navios.stream().allMatch(Navio::estaAfundado);
    }
}