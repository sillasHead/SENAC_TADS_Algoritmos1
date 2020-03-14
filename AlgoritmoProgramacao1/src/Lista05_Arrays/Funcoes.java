package Lista05_Arrays;

import java.util.Random;

public class Funcoes{
	Random r = new Random();
	
    public void exibirVetorInt(int[] vetor, String nome){
        System.out.println("Elementos do vetor "+ nome +":\n");
	
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("vetor[%d] = %d\n", i, vetor[i]);
		}	
		System.out.println();
    }

    public void exibirVetorDouble(double[] vetor, String nome){
    	System.out.println("Elementos do vetor "+ nome +":\n");
	
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("vetor[%d] = %f\n", i, vetor[i]);
		}	
		System.out.println();
    }
    
    public int[] criarVetorInt() {
//    	int[] vetor = new int[r.nextInt(100) + 1];
    	int[] vetor = new int[5];
    	
//    	for (int i = 0; i < vetor.length; i++) {
//    		vetor[i] = r.nextInt(100) + 1;
//		}
    	
    	for (int i = 0; i < vetor.length; i++) {
    		vetor[i] = i + 1;
    	}
    	
    	return vetor;
    }
    
    public double[] criarVetorDouble() {
//    	double[] vetor = new double[r.nextInt(100) + 1];
    	double[] vetor = new double[5];
    	
//    	for (int i = 0; i < vetor.length; i++) {
//    		vetor[i] = r.nextDouble() * 100;
//		}
    	
    	for (int i = 0; i < vetor.length; i++) {
    		vetor[i] = i + 1;
    	}
    	
    	return vetor;
    }
    
    
}
