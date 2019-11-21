package Lista05_Arrays;

public class Questao04 {
	public static void main(String[] args) {
		Funcoes f = new Funcoes();
		double[] v = f.criarVetorDouble();
		double menorN = v[0];
		
		f.exibirVetorDouble(v, "");
		
		for(int i = 1; i < v.length; i++) {
			if(v[i] < menorN) {
				menorN = v[i];
			}
		}
		
		System.out.println("Menor elemento do vetor: " + menorN);
	}
}

