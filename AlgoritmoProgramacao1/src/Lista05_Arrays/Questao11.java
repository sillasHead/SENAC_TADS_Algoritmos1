package Lista05_Arrays;

import java.util.Random;

public class Questao11 {
	public static void main(String[] args) {
		Funcoes f = new Funcoes();
		Random r = new Random();
		
		double[] v = f.criarVetorDouble();
		f.exibirVetorDouble(v, "");
		
		double numero = 0;
		
		for(int i = 0; i < v.length; i++) {
			numero += v[i];
		}
		
		numero /= v.length;
		
		System.out.println("numeros maiores do que a media dos elementos que estao nas posicoes pares do vetor.\n");
		for(int i = 0; i < v.length; i++) {
			if(v[i] > numero && i % 2 == 0) {
				System.out.println(v[i]);
			}
		}
	}
}
