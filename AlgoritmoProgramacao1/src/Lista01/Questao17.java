package Lista01;

import java.util.Scanner;

public class Questao17 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String ls = System.getProperty("line.separator");

		System.out.println("DESAFIO - Insira valores que sejam aceitos!" + ls);
		System.out.println("Para conseguir, insira 4 valores inteiros A, B, C e D.");
		System.out.println("Se B for maior do que C e se D for maior do que A, ");
		System.out.println("e a soma de C com D for maior que a soma de A e B e se C e D, ");
		System.out.println("ambos, forem positivos e se a variável A for par, os valores serão aceitos." + ls);

		System.out.print("A = ");
		int a = in.nextInt();
		System.out.print("B = ");
		int b = in.nextInt();
		System.out.print("C = ");
		int c = in.nextInt();
		System.out.print("D = ");
		int d = in.nextInt();

		if (b > c && d > a && (c + d) > (a + b) && c > 0 && d > 0 && (a % 2 == 0)) {
			System.out.println(ls + "Valores aceitos");
		} else {
			System.out.println(ls + "Valores não aceitos");
		}
	}
}
