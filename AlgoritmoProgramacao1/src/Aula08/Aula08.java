package Aula08;

import java.util.Scanner;

public class Aula08 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Insira dois números...");	
		System.out.println("O menor número inserido foi o " + minimo(in.nextInt(), in.nextInt()));
		
		in.close();
	}
		
	static int minimo(int a, int b) {
		int min = 0;
		
		if(a < b)
			min = a;
		
		else
			min = b;
		
		return min;
	}
}
