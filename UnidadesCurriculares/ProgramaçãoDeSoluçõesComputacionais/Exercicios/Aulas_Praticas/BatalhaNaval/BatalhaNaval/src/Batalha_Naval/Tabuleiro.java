package Batalha_Naval;

import java.util.Random;

public class Tabuleiro {
    private Celula[][] grid;
    private int tamanho;

    public Tabuleiro(int tamanho) {
        this.tamanho = tamanho;
        grid = new Celula[tamanho][tamanho];
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                grid[i][j] = new Celula();
            }
        }
    }

    public boolean atacar(int linha, int coluna) {
        if (linha >= 0 && linha < tamanho && coluna >= 0 && coluna < tamanho) {
            if (!grid[linha][coluna].foiAtingida()) {
                grid[linha][coluna].atingir();
                return grid[linha][coluna].temNavio();
            }
        }
        return false;
    }

    public boolean adicionarNavio(Navio navio) {
        Random rand = new Random();
        int dir = rand.nextInt(2);
        int linha, coluna;

        for (int tentativas = 0; tentativas < 100; tentativas++) {
            linha = rand.nextInt(tamanho);
            coluna = rand.nextInt(tamanho);

            if (podeColocarNavio(linha, coluna, navio.getTamanho(), dir)) {
                for (int i = 0; i < navio.getTamanho(); i++) {
                    int r = linha + (dir == 1 ? i : 0);
                    int c = coluna + (dir == 0 ? i : 0);
                    grid[r][c].colocarNavio(navio);
                }
                return true;
            }
        }
        return false;
    }

    private boolean podeColocarNavio(int linha, int coluna, int tamanhoNavio, int dir) {
        for (int i = 0; i < tamanhoNavio; i++) {
            int r = linha + (dir == 1 ? i : 0);
            int c = coluna + (dir == 0 ? i : 0);
            if (r >= tamanho || c >= tamanho || grid[r][c].temNavio()) {
                return false;
            }
        }
        return true;
    }

    public void mostrar(boolean revelar) {
        System.out.print("    ");
        for (int i = 0; i < tamanho; i++) {
            System.out.printf(" %2d ", i);
        }
        System.out.println();

        System.out.print("   ┌");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("───┬");
        }
        System.out.println("┐");

        for (int i = 0; i < tamanho; i++) {
            System.out.printf("%2d │", i);
            for (int j = 0; j < tamanho; j++) {
                System.out.print(" " + grid[i][j].mostrar(revelar) + " │");
            }
            System.out.println();

            if (i < tamanho - 1) {
                System.out.print("   ├");
                for (int j = 0; j < tamanho; j++) {
                    System.out.print("───┼");
                }
                System.out.println("┤");
            }
        }

        System.out.print("   └");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("───┴");
        }
        System.out.println("┘");
    }

    public int getTamanho() {
        return tamanho;
    }
}