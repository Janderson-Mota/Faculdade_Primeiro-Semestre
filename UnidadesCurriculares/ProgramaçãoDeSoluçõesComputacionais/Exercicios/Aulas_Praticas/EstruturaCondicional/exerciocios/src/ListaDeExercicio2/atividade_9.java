package ListaDeExercicio2;

import java.util.Locale;
import java.util.Scanner;

public class atividade_9 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o codigo referente a um mês: ");
		int codigoMes = sc.nextInt();
		String mes;

		switch (codigoMes) {

		case 1:
			mes = "Janeiro";
			break;

		case 2:
			mes = "Feverreiro";
			break;

		case 3:
			mes = "Março";
			break;

		case 4:
			mes = "Abril";
			break;

		case 5:
			mes = "Maio";
			break;

		case 6:
			mes = "Junho";
			break;

		case 7:
			mes = "Julho";
			break;
		case 8:
			mes = "Agosto";
			break;

		case 9:
			mes = "Setembro";
			break;

		case 10:
			mes = "Outubro";
			break;

		case 11:
			mes = "Novembro";
			break;

		case 12:
			mes = "Dezembro";
			break;

		default:
			mes = "valor invalido";
			break;
		}
			System.out.println("Mês escolhido: " + mes);	
		sc.close();
	}

}
