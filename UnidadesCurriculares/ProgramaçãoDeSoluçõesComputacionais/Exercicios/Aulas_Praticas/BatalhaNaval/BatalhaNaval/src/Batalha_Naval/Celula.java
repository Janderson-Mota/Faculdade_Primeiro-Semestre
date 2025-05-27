package Batalha_Naval;

public class Celula {
    private boolean temNavio;
    private boolean atingida;
    private Navio navio;

    public boolean temNavio() {
        return temNavio;
    }

    public void colocarNavio(Navio navio) {
        this.temNavio = true;
        this.navio = navio;
    }

    public boolean foiAtingida() {
        return atingida;
    }

    public void atingir() {
        this.atingida = true;
        if (temNavio && navio != null) {
            navio.receberDano();
        }
    }

    public String mostrar(boolean revelarNavios) {
        if (atingida) {
            if (temNavio) {
                return AnsiColors.RED + "X" + AnsiColors.RESET;
            } else {
                return AnsiColors.WHITE + "O" + AnsiColors.RESET;
            }
        } else {
            if (revelarNavios && temNavio) {
                return AnsiColors.GREEN + "N" + AnsiColors.RESET;
            } else {
                return AnsiColors.CYAN + "~" + AnsiColors.RESET;
            }
        }
    }
}