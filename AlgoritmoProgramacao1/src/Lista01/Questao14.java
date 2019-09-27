package Lista01;

import java.util.Scanner;

public class Questao14 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String ls = System.getProperty("line.separator");

		System.out.print("1� N�mero: ");
		double n1 = in.nextDouble();

		System.out.print("2� N�mero: ");
		double n2 = in.nextDouble();

		if (n1 == 0 || n2 == 0)
			System.out.print(ls + "N�o � poss�vel efetuar essa divis�o");

		else if (n1 != n2)
			System.out.print(ls + Math.max(n1, n2) + " � " + Math.min(n1, n2) + " = " + Math.max(n1, n2) / Math.min(n1, n2));

		else {
			System.out.print(ls + "Os n�meros s�o iguais...");
			System.out.print(ls + Math.max(n1, n2) + " � " + Math.min(n1, n2) + " = " + Math.max(n1, n2) / Math.min(n1, n2));
		}
	}
}
