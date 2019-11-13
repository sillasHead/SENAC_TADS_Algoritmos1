package Lista05_Arrays;

public class Questao02 {
	public static void main(String[] args) {
		Funcoes f = new Funcoes();
		double[] vetor = f.instanciarVetorDouble();
		double soma = 0;

		f.exibirVetorDouble(vetor);

		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}

		System.out.print("Soma de todos os elementos do vetor: " + soma);
	}
}
