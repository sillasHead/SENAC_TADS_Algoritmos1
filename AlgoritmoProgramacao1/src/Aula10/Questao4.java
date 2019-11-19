package Aula10;

public class Questao4 {
	public static void main(String[] args) {
		Funcoes f = new Funcoes();
		
		int[][] mat = {{1, 2, 3, 5}, {6, 7, 8, 9}, {9, 10, 11, 12}, {13, 14, 15, 16}};
		int soma = 0;
		
		System.out.println("Matriz impressa:\n");
		for (int[] vetor : mat) {
			for (int elemento : vetor) {
				System.out.printf("%4d", elemento);
			}
			System.out.println();
		}
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < i; j++) {
				soma += mat[i][j];
			}
		}
		
		System.out.println("\nSoma dos elementos abaixo da diagonal principal da matriz: " + soma);
	}
}
