package Lista01;

import java.util.Scanner;

public class Questao04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String ls = System.getProperty("line.separator");

		System.out.println("Insira dois n�meros inteiros e obtenha os consecutivos desses n�meros logo ap�s.");
		System.out.print(ls + (in.nextInt() + 1) + ls + (in.nextInt() + 1));
	}
}
