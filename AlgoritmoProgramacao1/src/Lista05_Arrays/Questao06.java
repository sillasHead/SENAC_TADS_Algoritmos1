package Lista05_Arrays;

public class Questao06 {
	public static void main(String[] args) {
		Funcoes f = new Funcoes();
		int[] v = f.criarVetorInt();
		int produto = v[0];
		
		f.exibirVetorInt(v, "");
		
		for(int i = 1; i < v.length; i++) {
			produto *= v[i];
		}
		
		System.out.println("Produto dos elementos do vetor: " + produto);
	}
}

