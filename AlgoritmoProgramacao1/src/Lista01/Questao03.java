package Lista01;

import java.util.Scanner;

public class Questao03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String ls = System.getProperty("line.separator");
		
		System.out.print("Insira dois números" + ls + "n1: ");
		double n1 = in.nextDouble();
		
		System.out.print("n2: ");
		double n2 = in.nextDouble();
		
		System.out.print(ls + n1 + "^2" + " + " + n2 + "^2" + " = " + n1*n1 + " + " + n2*n2 + " = " + (n1*n1 + n2*n2));
	}
}
