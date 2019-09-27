package Lista01;

import java.util.Scanner;

public class Questao18 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String ls = System.getProperty("line.separator");

		System.out.print("INFORME OS VALORES DE CADA LADO DO TRIÂNGULO" + ls + "A = ");
		double a = in.nextDouble();

		System.out.print("B = ");
		double b = in.nextDouble();

		System.out.print("C = ");
		double c = in.nextDouble();

		if (b >= a && b >= c) {
			a += b;
			b = a - b;
			a -= b;
		} else if (c >= a && c >= b) {
			a += c;
			c = a - c;
			a -= c;
		}

		if (a >= b + c) {
			System.out.println("NÃO FORMA TRIÂNGULO");

		} else {
			if (a * a == b * b + c * c)
				System.out.println("TRIÂNGULO RETÂNGULO");

			else if (a * a > b * b + c * c)
				System.out.println("TRIÂNGULO OBTUSÂNGULO");

			else
				System.out.println("TRIÂNGULO ACUTÂNGULO");

			if (a == b && a == c)
				System.out.println("TRIÂNGULO EQUILÁTERO");

			else if (a == b || a == c || b == c)
				System.out.println("TRIÂNGULO ISÓSCELES");
		}
	}
}
