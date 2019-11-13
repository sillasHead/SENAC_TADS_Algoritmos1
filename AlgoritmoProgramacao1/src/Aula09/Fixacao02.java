package Aula09;

import java.util.Scanner;

public class Fixacao02 {
	static Scanner in = new Scanner(System.in);

	static int[] numerosSorteados() {
		int[] numeros = { 2, 4, 7, 10, 2, 3, 3, 9, 2, 1, 10 };
		return numeros;
	}

	static int obterNumero() {
		System.out.print("Número: ");
		return in.nextInt();
	}

	static int ocorrencias(int[] v, int n) {
		int cont = 0;

		for (int i = 0; i < v.length; i++)
			cont = (n == v[i]) ? cont + 1 : cont;

		return cont;
	}

	public static void main(String[] args) {	
		int[] vetor = numerosSorteados();
		int num = obterNumero();
		int cont = ocorrencias(vetor, num);

		System.out.printf("O número %d apareceu %d vezes\n", num, cont);
	}
}
