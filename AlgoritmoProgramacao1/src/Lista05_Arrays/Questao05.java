package Lista05_Arrays;

public class Questao05 {
	public static void main(String[] args) {
		Funcoes f = new Funcoes();
		
		int[] vetor = f.instanciarVetorInt();
		
		f.exibirVetorInt(vetor);
		
		double media = vetor[0];
		
		for (int i = 1; i < vetor.length; i++) {
			media += vetor[i];
		}
		
		System.out.print("Media dos elementos do vetor: " + media/vetor.length);
	}
}
