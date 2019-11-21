package Aula10;

import java.util.Random;
import java.util.Scanner;

public class Funcoes {
	Scanner in = new Scanner(System.in);
	Random r = new Random();

	public int[][] criarMatriz() {
		int linhas, colunas, escolha;

		System.out.print("Insira a quantidade de linhas da matriz: ");
		linhas = in.nextInt();

		System.out.print("Insira a quantidade de colunas da matriz: ");
		colunas = in.nextInt();

		int[][] matriz = new int[linhas][colunas];

		System.out.print("\nO que prefere, inserir elemento a elemento dessa matriz\n"
				+ "ou que os números sejam gerados aleatoriamente?\n"
				+ "\n"
				+ "<1> Setar cada elemento\n"
				+ "<2> Gerar randomicamente\n"
				+ "\n"
				+ "Escolha: ");

		escolha = in.nextInt();

		switch (escolha) {
		case 1:
			System.out.println();
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					System.out.printf("matriz[%d][%d] = ", i, j);
					matriz[i][j] = in.nextInt();
				}
			}
			System.out.println("\nMatriz impressa:\n");
			for (int[] vetor : matriz) {
				for (int elemento : vetor) {
					System.out.printf("%4d", elemento);
				}
				System.out.println();
			}
			System.out.println();
			break;

		case 2:
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					matriz[i][j] = r.nextInt(100) + 1; 
				}
			}
			
			System.out.println("\nMatriz impressa:\n");
			for (int[] vetor : matriz) {
				for (int elemento : vetor) {
					System.out.printf("%4d", elemento);
				}
				System.out.println();
			}
			System.out.println();
			break;

		default:
			break;
		}

		return matriz;
	}
}
