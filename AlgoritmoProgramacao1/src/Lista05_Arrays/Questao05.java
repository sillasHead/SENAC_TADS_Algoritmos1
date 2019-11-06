package Lista05_Arrays;

public class Questao05 {
	public static void main(String[] args) {
		Funcoes funcoes = new Funcoes();
		
		int[] vetor = funcoes.instanciarVetorInt();
		
		funcoes.exibirVetorInt(vetor);
		
		double media = vetor[0];
		
		for (int i = 1; i < vetor.length; i++) {
			media += vetor[i];
		}
		
		System.out.print("Média dos elementos do vetor: " + media/vetor.length);
	}
}
