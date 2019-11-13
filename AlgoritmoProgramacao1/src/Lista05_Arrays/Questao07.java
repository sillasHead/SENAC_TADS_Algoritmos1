package Lista05_Arrays;

import java.util.Scanner;

public class Questao07 {
	public static void main(String[] args) {
		Funcoes f = new Funcoes();
		Scanner in = new Scanner(System.in);
		int[] vetor = f.instanciarVetorInt();
		
		f.exibirVetorInt(vetor);
		
		System.out.print("Insira um numero inteiro\nn = ");
		int n = in.nextInt();
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] *= n;
		}
		
		System.out.println("\n\nMultiplicando todos os elementos do vetor por " + n + "\n");
		System.out.println("| | |");
		System.out.println("V V V\n");
		
		f.exibirVetorInt(vetor);
	}
}
