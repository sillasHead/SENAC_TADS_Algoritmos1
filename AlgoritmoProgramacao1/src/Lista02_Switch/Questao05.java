package Lista02_Switch;

import java.util.Scanner;

public class Questao05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Digite um mês: ");
		String mes = in.next().toLowerCase();

		switch (mes) {
		case "janeiro":
		case "fevereiro":
		case "junho":
		case "julho":
		case "dezembro":
			System.out.print("Alta temporada");
			break;

		case "março":
		case "abril":
		case "maio":
		case "agosto":
		case "setembro":
		case "outubro":
		case "novembro":
			System.out.print("Baixa temporada");
			break;

		default:
			System.out.print("Quê?");
		}
	}
}
