package Lista05_Arrays;

public class Questao39 {
	public static void main(String[] args) {
		int[][] a = new int[2][3];
		int[][] b = new int[a[0].length][5];
		int cont = 0, produto = 0, auxA = 0;
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				a[i][j] = cont;
			}
			cont++;
		} cont = 0;
		
		System.out.println("Vetor A");
		for(int[] vetor : a) {
			for(int elemento : vetor) {
				System.out.printf("%2d", elemento);
			}
			System.out.println();
		} System.out.println();
		
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < b[i].length; j++) {
				b[i][j] = cont;
			}
			cont++;
		} cont = 0;

		System.out.println("Vetor B");
		for(int[] vetor : b) {
			for(int elemento : vetor) {
				System.out.printf("%2d", elemento);
			}
			System.out.println();
		} System.out.println();
		
		System.out.println("A * B");
		for(int i = 0; i < a.length; i++) {
			cont = 0;
			for(int j = 0; j < a[i].length * b[i].length; j++) {
				produto += a[i][auxA] * b[auxA++][cont];
				if(auxA == 3) {
					System.out.printf("%3d", produto);
					cont++;
					auxA = 0;
					produto = 0;
				}
			}
			System.out.println();
		}
	}
}
