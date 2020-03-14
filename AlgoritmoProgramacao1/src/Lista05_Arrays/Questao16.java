package Lista05_Arrays;

public class Questao16 {
	public static void main(String[] args) {
		Funcoes f = new Funcoes();
		int[] v = f.criarVetorInt();
		
		f.exibirVetorInt(v, "");
		
		int[] aux = new int[v.length];
		int cont = 0;
		for (int i = 0; i < aux.length; i = i + 2) {
			aux[cont++] = v[i];
		}
		
		for (int i = 1; i < aux.length; i = i + 2) {
			aux[cont++] = v[i];
		}
		
		f.exibirVetorInt(aux, "pares depois impares");		
	}
}
