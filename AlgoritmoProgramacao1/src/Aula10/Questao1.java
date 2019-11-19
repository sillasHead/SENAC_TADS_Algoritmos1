package Aula10;

public class Questao1 {
	public static void main(String[] args) {
		int[][]	v1 = {{1, 2}, {3, 4}};	
		int[][]	v2 = {{8, 7}, {6, 5}};

		for (int i = 0; i < v1.length; i++) {
			for (int j = 0; j < v1[0].length; j++) {
				System.out.print(v1[i][j] + v2[i][j] + " ");
			}
			System.out.println();
		}
	}	
}