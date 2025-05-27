package Batalha_Naval;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== BATALHA NAVAL ===");
        System.out.println("1 - Um jogador (vs Máquina)");
        System.out.println("2 - Dois jogadores");
        System.out.print("Escolha o modo: ");
        int modo = sc.nextInt();

        System.out.print("Tamanho do tabuleiro: ");
        int tamanho = sc.nextInt();

        sc.nextLine();

        System.out.print("Nome do Jogador 1: ");
        String nome1 = sc.nextLine();
        List<Navio> navios1 = gerarNavios();

        Jogador jogador1 = new Jogador(nome1, tamanho, navios1);
        Jogador jogador2;

        if (modo == 1) {
            jogador2 = new Jogador("Máquina", tamanho, gerarNavios());
        } else {
            System.out.print("Nome do Jogador 2: ");
            String nome2 = sc.nextLine();
            jogador2 = new Jogador(nome2, tamanho, gerarNavios());
        }

        while (true) {
            System.out.println("\n📍 Tabuleiro do oponente:");
            jogador2.getTabuleiro().mostrar(false);
            jogador1.jogar(jogador2, sc, true);
            if (jogador2.perdeu()) {
                System.out.println("🏆 " + jogador1.getNome() + " venceu!");
                break;
            }

            if (modo == 1) {
                jogador2.jogar(jogador1, sc, false);
            } else {
                System.out.println("\n📍 Tabuleiro do oponente:");
                jogador1.getTabuleiro().mostrar(false);
                jogador2.jogar(jogador1, sc, true);
            }

            if (jogador1.perdeu()) {
                System.out.println("🏆 " + jogador2.getNome() + " venceu!");
                break;
            }

            System.out.println("\n== Placar Atual ==");
            System.out.println("🎖️  " + jogador1.getNome() + ": " + jogador1.getPontuacao() + " pontos");
            System.out.println("🎖️  " + jogador2.getNome() + ": " + jogador2.getPontuacao() + " pontos");
        }

        System.out.println("\n--- Placar Final ---");
        System.out.println("🥇 " + jogador1.getNome() + ": " + jogador1.getPontuacao());
        System.out.println("🥇 " + jogador2.getNome() + ": " + jogador2.getPontuacao());
    }

    private static List<Navio> gerarNavios() {
        List<Navio> navios = new ArrayList<>();
        navios.add(new Navio("Porta-Aviões", 4));
        navios.add(new Navio("Encouraçado", 3));
        navios.add(new Navio("Cruzador", 2));
        navios.add(new Navio("Submarino", 1));
        return navios;
    }
}