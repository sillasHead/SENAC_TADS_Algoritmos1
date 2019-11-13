package Lista05_Arrays;

public class Questao06 {
	public static void main(String[] args) {
		Funcoes f = new Funcoes();
		int produto = 1; 
		int[] vetor = f.instanciarVetorInt();
		
		f.exibirVetorInt(vetor);
		
		for (int i = 0; i < vetor.length; i++) {
			produto *= vetor[i];
		}
		
		System.out.println("Produto dos elementos do vetor: " + produto);
	}
}
