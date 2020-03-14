package Lista05_Arrays;

public class Questao18 {
	public static void main(String[] args) {
		Funcoes f = new Funcoes();
		int v[] = f.criarVetorInt(), n = 3, pos = -1;
		
		f.exibirVetorInt(v, "");
		
		for (int i = 0; i < v.length; i++) {
			if (v[i] == n) {
				pos = i;
			}
		}
		
		if (pos != -1) {
			System.out.println("Posicao onde o numero foi encontrado: " + pos);
		} else {
			System.out.println("Nao foi encontrado");
		}
	}
}
