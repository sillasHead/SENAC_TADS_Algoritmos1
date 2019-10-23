package Aula09;

import java.util.Scanner;

public class Questao01 {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int[] novoVetor = copiaVetor();
		
		for (int i : novoVetor) {
			System.out.println("vetor[" + i + "] = " + i);
		}
		
		in.close();
	}
	
	static int[] copiaVetor() {
		int[] novoVetor = new int[in.nextInt()];
		
		for (int i = 0; i < novoVetor.length; i++) {
			novoVetor[i] = in.nextInt();
		}
		return novoVetor;
	}
}
