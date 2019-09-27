package Lista01;

import java.util.Scanner;

public class Questao07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Insira os valores dos catetos");
		
		System.out.print("Cateto 1: ");
		double cat1 = in.nextDouble();
		
		System.out.print("Cateto 2: ");
		double cat2 = in.nextDouble();
		
		double hipot = Math.sqrt(cat1*cat1 + cat2*cat2);
		
		System.out.print("A hipotenusa desse triângulo é igual a " + hipot);
	}
}
