package Lista02_Switch;

import java.util.Scanner;

public class Questao01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Insira um n�mero");
		int n1 = in.nextInt();

		int n2 = n1 % 3;

		switch (n2) {
		case 0:
			System.out.println("� divis�vel por 3");
			break;
		default:
			System.out.println("N�o � divis�vel por 3");
		}
	}
}
