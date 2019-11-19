package Lista05_Arrays;

public class Questao05 {
	public static void main(String[] args) {
		Funcoes f = new Funcoes();
		int[] v = f.criarVetorInt();
		int media = v[0];
		
		f.exibirVetorInt(v);
		
		for(int i = 1; i < v.length; i++) {
			media += v[i];
		}
		
		media /= v.length;
		
		System.out.println("Media dos elementos do vetor: " + media);
	}
}
