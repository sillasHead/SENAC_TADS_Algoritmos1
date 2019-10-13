package Lista01;

import java.util.Scanner;

public class Questao15 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String ls = System.getProperty("line.separator");

		System.out.print("ax² + bx + c = 0" + ls + ls + "a = ");
		double a = in.nextDouble();

		System.out.print("b = ");
		double b = in.nextDouble();

		System.out.print("c = ");
		double c = in.nextDouble();

		double delta = b * b - 4 * a * c;

		double x1 = (-b + Math.sqrt(delta)) / 2 * a;
		double x2 = (-b - Math.sqrt(delta)) / 2 * a;

		if (a == 0 || delta < 0) {
			System.out.println(ls + "Impossível calcular");
		} else {
			System.out.println(ls + "(" + a + ")" + "x² + " + "(" + b + ")" + "x + " + "(" + c + ")" + " = 0" + ls);
			System.out.println("x' = " + x1);
			System.out.println("x\" = " + x2);
		}
		
		in.close();
	}
}
