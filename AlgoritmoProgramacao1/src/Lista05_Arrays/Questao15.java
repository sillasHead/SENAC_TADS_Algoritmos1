package Lista05_Arrays;

public class Questao15 {
	public static void main(String[] args) {
		Funcoes f = new Funcoes();
		int[] v = f.criarVetorInt(), aux = v;
		
		f.exibirVetorInt(v, "");
		
		for(int i = 0; i < v.length; i++) {
			if(aux[0] > v[i]) {
				aux[0] = v[i];
			}
		}	
		
		for(int i = 1; i < v.length; i++) {
			for(int j = 0; j < v.length; j++) {
				if(aux[i] > v[j] && v[j] > aux[i - 1]) {
					aux[i] = v[j];
				}
			}	
		}
		
		f.exibirVetorInt(aux, "em ordem crescente");
	}
}
