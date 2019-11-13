package Lista05_Arrays;

public class Questao03 {
	public static void main(String[] args) {
		Funcoes f = new Funcoes();
		int maiorN = 0; int indice = 0;
		int[] vetor = f.instanciarVetorInt();
		
		f.exibirVetorInt(vetor);
		
		for(int i = 0; i < vetor.length; i++) {
			if (vetor[i] > maiorN) {
				maiorN = vetor[i];
				indice = i;
			}
			
		}
		
		System.out.printf("Maior elemento do vetor\n-> vetor[%d]: %d", indice, maiorN);
	}
}
