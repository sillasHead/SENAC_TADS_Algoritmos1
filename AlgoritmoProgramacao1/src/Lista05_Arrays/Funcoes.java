package Lista05_Arrays;

import java.util.Random;

public class Funcoes {
	public void exibirVetorInt(int[] vetor) {
		System.out.println("Elementos do vetor:");
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("vetor[%d] = %d\n", i, vetor[i]);
		}
		System.out.println();
	}
	
	
	public void exibirVetorDouble(double[] vetor) {
		System.out.println("Elementos do vetor:");
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("vetor[%d] = %f\n", i, vetor[i]);
		}
		System.out.println();
	}
	
	
	public int[] instanciarVetorInt() {
		Random random = new Random();
		int[] vetor = new int[random.nextInt(5) + 1];
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = random.nextInt(100) + 1;
		}
		
		return vetor;
	}
	
	
	public double[] instanciarVetorDouble() {
		Random random = new Random();
		double[] vetor = new double[random.nextInt(5) + 1];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (random.nextDouble() + 1) * 100;
		}
		
		return vetor;
	}
}
