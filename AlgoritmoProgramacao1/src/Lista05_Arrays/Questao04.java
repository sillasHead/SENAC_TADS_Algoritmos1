package Lista05_Arrays;

public class Questao04 {
	public static void main(String[] args) {
		Funcoes f = new Funcoes();
		double[] vetor = f.instanciarVetorDouble();
		
		f.exibirVetorDouble(vetor);
		
		double menorN = vetor[0]; int indice = 0;
		
		for(int i = 1; i < vetor.length; i++) {
			if (vetor[i] < menorN) {
				menorN = vetor[i];
				indice = i;
			}
			
		}
		
		System.out.printf("Menor elemento do vetor\n-> vetor[%d]: %f", indice, menorN);
	}
}