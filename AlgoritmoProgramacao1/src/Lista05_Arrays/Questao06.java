package Lista05_Arrays;

public class Questao06 {
	public static void main(String[] args) {
		Funcoes funcoes = new Funcoes();
		int produto = 1; 
		int[] vetor = funcoes.instanciarVetorInt();
		
		funcoes.exibirVetorInt(vetor);
		
		for (int i = 0; i < vetor.length; i++) {
			produto *= vetor[i];
		}
		
		System.out.println("Produto dos elementos do vetor: " + produto);
	}
}
