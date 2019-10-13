package Lista01;

import java.util.Scanner;

public class Questao11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Quer saber se um numero é negativo? Insira-o a seguir.");
		double n = in.nextDouble();

		if (n < 0)
			System.out.print("Numero negativo");

		else
			System.out.print("Esse número não é negativo");
			
		in.close();
	}
}
