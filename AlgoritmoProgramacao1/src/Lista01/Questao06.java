package Lista01;

import java.util.Scanner;

public class Questao06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String ls = System.getProperty("line.separator");
		final double pi = 3.14159;
		
		System.out.println("Insira três valores");
		
		System.out.print("A: ");
		double a = in.nextDouble();
		
		System.out.print("B: ");
		double b = in.nextDouble();
		
		System.out.print("C: ");
		double c = in.nextDouble();
		
		System.out.println(ls + "área do triângulo retângulo: " + a*c/2);
		System.out.println("área do círculo: " + c*c*pi);
		System.out.println("área do trapézio: " + (a+b)*c/2);
		System.out.println("área do quadrado: " + b*b);
		System.out.println("área do retângulo: " + a*b);
		System.out.println("Perímetro do retângulo: " + (a*2 + b*2));
		
		in.close();
	}
}
