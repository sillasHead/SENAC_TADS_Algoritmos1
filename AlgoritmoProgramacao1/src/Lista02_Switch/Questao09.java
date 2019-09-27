package Lista02_Switch;

import java.util.Scanner;

public class Questao09 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String ls = System.getProperty("line.separator");

		System.out.println("Valida��o de CPF" + ls);

		System.out.print(" 1� d�gito: ");
		int d1 = in.nextInt();

		System.out.print(" 2� d�gito: ");
		int d2 = in.nextInt();

		System.out.print(" 3� d�gito: ");
		int d3 = in.nextInt();

		System.out.print(" 4� d�gito: ");
		int d4 = in.nextInt();

		System.out.print(" 5� d�gito: ");
		int d5 = in.nextInt();

		System.out.print(" 6� d�gito: ");
		int d6 = in.nextInt();

		System.out.print(" 7� d�gito: ");
		int d7 = in.nextInt();

		System.out.print(" 8� d�gito: ");
		int d8 = in.nextInt();

		System.out.print(" 9� d�gito: ");
		int d9 = in.nextInt();

		System.out.print("10� d�gito: ");
		int d10 = in.nextInt();

		System.out.print("11� d�gito: ");
		int d11 = in.nextInt();

		int validacao1 = 11 - (d1 * 10 + d2 * 9 + d3 * 8 + d4 * 7 + d5 * 6 + d6 * 5 + d7 * 4 + d8 * 3 + d9 * 2) % 11;
		int validacao2 = 11 - (d1 * 11 + d2 * 10 + d3 * 9 + d4 * 8 + d5 * 7 + d6 * 6 + d7 * 5 + d8 * 4 + d9 * 3 + d10 * 2) % 11;

		switch (validacao1 - d10) {
		case 0:
			switch (validacao2 - d11) {
			case 0:
				System.out.print(ls + d1 + d2 + d3 + "." + d4 + d5 + d6 + "." + d7 + d8 + d9 + "-" + d10 + d11
						+ "   -> CPF v�lido");
				break;

			default:
				System.out.print(ls + d1 + d2 + d3 + "." + d4 + d5 + d6 + "." + d7 + d8 + d9 + "-" + d10 + d11
						+ "   -> CPF inv�lido");
			}
			break;

		default:
			System.out.print(ls + d1 + d2 + d3 + "." + d4 + d5 + d6 + "." + d7 + d8 + d9 + "-" + d10 + d11
					+ "   -> CPF inv�lido");
		}
	}
}
