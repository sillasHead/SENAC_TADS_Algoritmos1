package Aula09;

import java.util.Scanner;

public class Questao03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Insira o tamanho dos vetores: ");
		
		int[] v1 = new int[in.nextInt()];
		int[] v2 = v1;
		
		for (int i = 0; i < v1.length; i++) {
			System.out.println("v1[" + i + "] = " + (i + 1) + "     v2[" + i + "] = " + (i + 1));
			v1[i] = i+1;
			v2[i] = i+1;
		}

		int[] v3 = unirVetores(v1, v2);
		
		System.out.println("\nUnião dos vetores:");
		
		for (int i = 0; i < v3.length; i++) {
			System.out.println("v3[" + i + "] = " + v3[i]);
		}
		
		in.close();
	}
	
	static int[] unirVetores(int[] v1, int[] v2) {
		int[] v3 = new int[v1.length + v2.length];
		
		for(int i = 0; i < v1.length; i++)
			v3[i] = v1[i];
		
		for(int i = 0; i < v1.length; i++)
			v3[i + v1.length] = v2[i];
		
		return v3;
	}
}
