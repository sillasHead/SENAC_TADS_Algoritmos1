package Aula10;

public class Fixacao2 {
	public static void main(String[] args) {
		int n = 6;
		int[][] m = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					m[i][j] = 0;
				} else if ((i + j) == (n - 1)) {
					m[i][j] = 1;
				} else {
					m[i][j] = 2;
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
