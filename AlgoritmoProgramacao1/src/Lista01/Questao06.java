package Lista01;

import java.util.Scanner;

public class Questao06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String ls = System.getProperty("line.separator");
		final double pi = 3.14159;
		
		System.out.println("Insira tr�s valores");
		
		System.out.print("A: ");
		double a = in.nextDouble();
		
		System.out.print("B: ");
		double b = in.nextDouble();
		
		System.out.print("C: ");
		double c = in.nextDouble();
		
		System.out.println(ls + "�rea do tri�ngulo ret�ngulo: " + a*c/2);
		System.out.println("�rea do c�rculo: " + c*c*pi);
		System.out.println("�rea do trap�zio: " + (a+b)*c/2);
		System.out.println("�rea do quadrado: " + b*b);
		System.out.println("�rea do ret�ngulo: " + a*b);
		System.out.println("Per�metro do ret�ngulo: " + (a*2 + b*2));
	}
}
