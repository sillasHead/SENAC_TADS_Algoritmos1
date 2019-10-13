package Lista02_Switch;

import java.util.Scanner;

public class Questao04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int mes, ano, qtdDias;

		System.out.print("Mês: ");
		mes = in.nextInt();
		System.out.print("Ano: ");
		ano = in.nextInt();

		switch (ano % 4) {
		case 0:
			switch (ano % 100) {
			case 0:
				switch (ano % 400) {
				case 0:
					qtdDias = 29;
					break;

				default:
					qtdDias = 28;
				}
				break;

			default:
				qtdDias = 29;
			}
			break;

		default:
			qtdDias = 28;
		}

		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.print("Esse mês tem 31 dias");
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			System.out.print("Esse mês tem 30 dias");
			break;

		case 2:
			System.out.print("Esse mês tem " + qtdDias + " dias");
			break;

		default:
			System.out.print("Dados inválidos");
		}
		
		in.close();
	}
}
