package Lista01;

import java.util.Scanner;

public class Questao18 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String ls = System.getProperty("line.separator");

		System.out.print("INFORME OS VALORES DE CADA LADO DO TRI�NGULO" + ls + "A = ");
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
			System.out.println("N�O FORMA TRI�NGULO");

		} else {
			if (a * a == b * b + c * c)
				System.out.println("TRI�NGULO RET�NGULO");

			else if (a * a > b * b + c * c)
				System.out.println("TRI�NGULO OBTUS�NGULO");

			else
				System.out.println("TRI�NGULO ACUT�NGULO");

			if (a == b && a == c)
				System.out.println("TRI�NGULO EQUIL�TERO");

			else if (a == b || a == c || b == c)
				System.out.println("TRI�NGULO IS�SCELES");
		}
	}
}
