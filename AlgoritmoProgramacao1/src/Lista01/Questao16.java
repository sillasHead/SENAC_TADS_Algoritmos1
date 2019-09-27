package Lista01;

import java.util.Scanner;

public class Questao16 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("HORA INICIAL: ");
		double horaInicial = in.nextDouble();

		System.out.print("HORA FINAL: ");
		double horaFinal = in.nextDouble();

		if (horaInicial > 24 || horaInicial < 0 || horaFinal > 24 || horaFinal < 0)
			System.out.print("OS VALORES INSERIDOS SÃO INVÁLIDOS");

		else {
			if (horaFinal <= horaInicial) {
				System.out.println("O JOGO DUROU " + (24 - horaInicial + horaFinal) + " HORA(S)");
			} else {
				System.out.println("O JOGO DUROU " + (horaFinal - horaInicial) + " HORA(S)");
			}
		}
	}
}
