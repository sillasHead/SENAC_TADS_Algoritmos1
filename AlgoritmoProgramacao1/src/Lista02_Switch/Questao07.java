package Lista02_Switch;

import java.util.Scanner;

public class Questao07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Idade do conveniado: ");
		int idade = in.nextInt();
		int valorFixo = 100;

		switch (Math.min(idade, 61)) {
		case 61:
			System.out.print("Valor a ser pago: R$ " + (valorFixo + 130));
			break;

		default:
			switch (Math.min(idade, 40)) {
			case 40:
				System.out.print("Valor a ser pago: R$ " + (valorFixo + 95));
				break;

			default:
				switch (Math.min(idade, 31)) {
				case 31:
					System.out.print("Valor a ser pago: R$ " + valorFixo);
					break;

				default:
					switch (Math.min(idade, 10)) {
					case 10:
						System.out.print("Valor a ser pago: R$ " + (valorFixo + 50));
						break;

					default:
						System.out.print("Valor a ser pago: R$ " + (valorFixo + 80));
					}
				}
			}
		}
	}
}
