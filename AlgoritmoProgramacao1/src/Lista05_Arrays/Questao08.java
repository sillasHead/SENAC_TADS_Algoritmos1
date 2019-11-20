package Lista05_Arrays;

import java.util.Random;

public class Questao08 {
	public static void main(String[] args) {
		Funcoes f = new Funcoes();
		Random r = new Random();
		int[] v = f.criarVetorInt();
		int numero = r.nextInt(100) + 1;
		boolean presente = false;
		
		
		System.out.println("Numero aleatorio: " + numero + "\n");
		
		f.exibirVetorInt(v);
		
		for(int i = 0; i < v.length; i++) {
			presente = v[i] == numero ? true : false;
		}
		
		if(presente) {
			System.out.println("O numero " + numero + " esta presente no vetor!");
		} else {
			System.out.println("O numero " + numero + " nao esta presente no vetor!");
		}
	}
}
