package Lista01;

import java.util.Scanner;

public class Questao12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Insira o valor que representa o lado do quadrado: ");
		double l = in.nextDouble();

		System.out.print("Insira o valor que representa o raio do círculo: ");
		double r = in.nextDouble();

		if (l * l > Math.PI * (r * r))
			System.out.println("O quadrado tem a maior área");
		else if (l * l < Math.PI * (r * r))
			System.out.println("O círculo tem a maior área");
		else
			System.out.println("Ambos possuem áreas iguais");

		in.close();
	}
}
