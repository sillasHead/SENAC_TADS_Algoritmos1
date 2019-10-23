package Aula09;

import java.util.Scanner;

public class Fixacao {
	public static void main(String[] kkk) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int[] v = new int[n];
		
	   	
	   	for(int i = 0; i < n; i++) {
	   		System.out.print("Digite um número: ");
	   		v[i] = in.nextInt();
	   	}		
	}
}
