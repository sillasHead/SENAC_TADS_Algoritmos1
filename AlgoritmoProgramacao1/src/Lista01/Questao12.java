package Lista01;

import java.util.Scanner;

public class Questao12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Insira o valor que representa o lado do quadrado: ");
		double l = in.nextDouble();

		System.out.print("Insira o valor que representa o raio do c�rculo: ");
		double r = in.nextDouble();

		if (l * l > Math.PI * (r * r))
			System.out.println("O quadrado tem a maior �rea");
		else if (l * l < Math.PI * (r * r))
			System.out.println("O c�rculo tem a maior �rea");
		else
			System.out.println("Ambos possuem �reas iguais");

	}
}
