package Lista05_Arrays;

public class Questao02 {
	public static void main(String[] args) {
		Funcoes f = new Funcoes();
	
		double[] v = f.criarVetorDouble();
		double soma = 0;

		f.exibirVetorDouble(v);

		for (int i = 0; i < v.length; i++) {
			soma += v[i];
		}

		System.out.printf("Soma de todos os elementos do vetor: %f", soma);
	}
}

