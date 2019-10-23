package Aula09;

import java.util.Scanner;

public class Questao02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Qual será o tamanho dos vetores?");
		int[] vetor1 = new int[in.nextInt()];
		
		for (int i = 0; i < vetor1.length; i++) {
			vetor1[i] = i;
		}
		
		int[] vetor2 = vetor1;
		
		int[] vetor3 = somaVetores(vetor1, vetor2);
		
		System.out.println("Seguem anexas as somas dos dois vetores");
		
		for(int i = 0; i < vetor1.length; i++) {
			System.out.println("v1[" + i + "] + v2[" + i + "] = " + vetor3[i]);
		}
	}
	
	static int[] somaVetores(int[] vetor1, int[] vetor2) {
		int[] vetor3 = vetor1;
		
		for(int i = 0; i < vetor1.length; i++)
			vetor3[i] += vetor2[i];
		
		return vetor3;
	}
}
