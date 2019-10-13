package Lista01;

import java.util.Scanner;

public class Questao08 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Insira quatro números");
		
		System.out.print("n1: ");
		double n1 = in.nextDouble();
		
		System.out.print("n2: ");
		double n2 = in.nextDouble();
		
		System.out.print("n3: ");
		double n3 = in.nextDouble();
		
		System.out.print("n4: ");
		double n4 = in.nextDouble();
		
		System.out.println("A média aritmética desses números é igual a " + (n1+n2+n3+n4)/4);
		
		in.close();
	}
}
