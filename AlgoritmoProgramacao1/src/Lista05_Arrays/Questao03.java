package Lista05_Arrays;

import java.util.Random;

public class Questao03 {
	public static void main(String[] args) {
		Funcoes f = new Funcoes();
		int[] v = f.criarVetorInt();
		int maiorN = v[0];
		
		f.exibirVetorInt(v);
		
		for(int i = 1; i < v.length; i++) {
			if(v[i] > maiorN) {
				maiorN = v[i];
			}
		}
		
		System.out.println("Maior elemento do vetor: " + maiorN);
	}
}

