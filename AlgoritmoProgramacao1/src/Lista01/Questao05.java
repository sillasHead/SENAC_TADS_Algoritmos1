package Lista01;

import java.util.Scanner;

public class Questao05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String ls = System.getProperty("line.separator");
		
		System.out.print("Insira um valor:" + ls
					   + "    ______" + ls
					   + "   |      |" + ls
					   + "   |      |" + ls
					   + "   |______|"
					   + ls + ls
					   + "   |------|" + ls
					   + "  L = ");
		
		double l = in.nextDouble();						 
		
		System.out.println(ls + "A área desse quadrado é igual a " + l*l);
	}
}
