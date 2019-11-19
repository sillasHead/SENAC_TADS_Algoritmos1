package Aula10;

public class Questao3 {
	public static void main(String[] args) {
		Funcoes f = new Funcoes();
		
		int[][] mat = {{1, 2, 3}, {4, 5, 6}};
		int soma = 0;
		System.out.println("Matriz impressa:\n");
		for (int[] vetor : mat) {
			for (int elemento : vetor) {
				System.out.printf("%4d", elemento);
				soma += elemento;
			}
			System.out.println();
		}
		System.out.println("\nSoma de todos os elementos da matriz: " + soma);
	}
}
