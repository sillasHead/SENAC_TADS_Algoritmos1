package Lista01;

import java.util.Scanner;

public class Questao13 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String ls = System.getProperty("line.separator");

		System.out.print("Insira três números" + ls + "n1: ");
		double n1 = in.nextDouble();

		System.out.print("n2: ");
		double n2 = in.nextDouble();

		System.out.print("n3: ");
		double n3 = in.nextDouble();

		System.out.println("O maior valor inserido é o " + Math.max(Math.max(n1, n2), n3));
	}
}
