package Lista02_Switch;

import java.util.Scanner;

public class Questao02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Dia ");
		int dia = in.nextInt();

		switch (dia) {
		case 1:
			System.out.println("Domingo -> Fim de semana");
			break;

		case 2:
			System.out.println("Segunda-Feira -> Dia �til");
			break;

		case 3:
			System.out.println("Ter�a-Feira -> Dia �til");
			break;

		case 4:
			System.out.println("Quarta-Feria -> Dia �til");
			break;

		case 5:
			System.out.println("Quinta-Feira -> Dia �til");
			break;

		case 6:
			System.out.println("Sexta-Feira -> Dia �til");
			break;

		case 7:
			System.out.println("S�bado - Fim de semana");
			break;

		default:
			System.out.println("Dia inv�lido");
		}
	}
}
