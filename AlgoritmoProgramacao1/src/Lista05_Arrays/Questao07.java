package Lista05_Arrays;

import java.util.Random;

public class Questao07 {
	public static void main(String[] args) {
		Funcoes f = new Funcoes();
		Random r = new Random();
		int[] v = f.criarVetorInt();
		int numero = r.nextInt(100) + 1;
		
		System.out.println("Número aleatório: " + numero + "\n");
		
		f.exibirVetorInt(v);
		
		System.out.println("Resultado das multiplicacoes de todos os elementos do vetor por " + numero + ":\n");
		
		for (int i = 0; i < v.length; i++) {
			System.out.printf("%d * %d = %d\n", v[i], numero, v[i] * numero);
		}	
	}
}
