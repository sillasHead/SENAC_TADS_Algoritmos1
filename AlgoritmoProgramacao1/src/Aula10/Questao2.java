package Aula10;

public class Questao2 {
	public static void main(String[] args) {
		Funcoes f = new Funcoes();
		int[][] m = f.criarMatriz();
		
		System.out.println("Matriz transposta:\n");
		for (int i = 0; i < m[0].length; i++) {
			for (int j = 0; j < m.length; j++) {
				System.out.printf("%4d", m[j][i]);
			}
			System.out.println();
		}
	}
}