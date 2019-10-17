package Lista03_LacosRepeticao;

import java.util.Scanner;

public class Questao15 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite um número natural maior do que zero"
					 + "\nn: ");
		int n = in.nextInt();

		for(int i = n-1; i >= 1; i--)
			n *= i;
		
		if(n != 0)
			System.out.print("Fatorial de n: " + n);
		else
			System.out.print("Fatorial de n: 1");

		in.close();
	}
}
