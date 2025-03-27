package ListaDeExercicio;

import java.util.Scanner;

public class exercicio_10 {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        int numeroBoiGordo = 0, numeroBoiMagro = 0;
        double pesoBoiGordo = 0, pesoBoiMagro = 0, somaPesos = 0;
        int totalBois = 90;
        int contador=0;
        
        
        while (contador < totalBois) {
            System.out.print("Digite o número de identificação do boi: ");
            int numeroBoi = scanner.nextInt();
            System.out.print("Digite o peso do boi: ");
            double pesoBoi = scanner.nextDouble();

            somaPesos += pesoBoi;

            if (pesoBoi > pesoBoiGordo) {
                pesoBoiGordo = pesoBoi;
                numeroBoiGordo = numeroBoi;
            }
            
            if (pesoBoi < pesoBoiMagro) {
                pesoBoiMagro = pesoBoi;
                numeroBoiMagro = numeroBoi;
            }
            
            contador++;
        }

        double mediaPesos = somaPesos / totalBois;

        System.out.println("Boi mais gordo: Número " + numeroBoiGordo + ", Peso: " + pesoBoiGordo + " kg");
        System.out.println("Boi mais magro: Número " + numeroBoiMagro + ", Peso: " + pesoBoiMagro + " kg");
        System.out.println("Peso médio dos bois: " + mediaPesos + " kg");

        scanner.close();
    }}
