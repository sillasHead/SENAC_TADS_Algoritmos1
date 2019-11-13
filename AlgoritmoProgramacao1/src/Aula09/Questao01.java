package Aula09;

import java.util.Scanner;

public class Questao01 {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int[] novoVetor = copiaVetor();
		int cont = 0;
		
		System.out.println("\nVetor copiado:");
		
		for (int i : novoVetor) {
			System.out.println("vetor2[" + cont++ + "] = " + i);
		}
		
		in.close();
	}
	
	static int[] copiaVetor() {
		System.out.print("Insira o tamanho do vetor[]: ");
		int[] novoVetor = new int[in.nextInt()];
		
		for (int i = 0; i < novoVetor.length; i++) {
			System.out.printf("Insira o valor do %dº item: ", i + 1);
			novoVetor[i] = in.nextInt();
		}
		return novoVetor;
	}
}
