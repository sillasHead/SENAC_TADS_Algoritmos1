package Lista05_Arrays;

import java.util.Random;

public class Questao10 {
	public static void main(String[] args) {
		Funcoes f = new Funcoes();
		Random r = new Random();
		
		double[] v = f.criarVetorDouble();
		
		double n = r.nextDouble() * 100;
		System.out.println("Numero real aleatorio: " + n + "\n");
		
		f.exibirVetorDouble(v);
		
		System.out.println("Multiplicacao dos elementos de posicao impar pelo numero real aleatorio");
		
		for(int i = 0; i < v.length; i++) {
			if(i % 2 != 0) {
				System.out.printf("%f x %f = %f\n", v[i], n, v[i] * n);
			}
		}
	}
}
