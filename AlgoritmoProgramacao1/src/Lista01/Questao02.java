package Lista01;

import java.util.Scanner;

public class Questao02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String ls = System.getProperty("line.separator");

		System.out.print("Insira um número: ");
		double n1 = in.nextDouble();

		System.out.print("Insira o valor do expoente: ");
		double n2 = in.nextDouble();

		System.out.print(ls + n1 + " elevado a " + n2 + " é igual a " + Math.pow(n1, n2));

		in.close();
	}
}
