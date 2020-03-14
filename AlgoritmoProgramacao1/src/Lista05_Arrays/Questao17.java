package Lista05_Arrays;

public class Questao17 {
	public static void main(String[] args) {
		Funcoes f = new Funcoes();
		
		double v[] = f.criarVetorDouble(), aux[] = new double[v.length], n = 2;
		
		f.exibirVetorDouble(v, "");
		
		for (int i = 0; i < v.length; i++) {
			aux[i] = v[i] * n;
		}
		
		f.exibirVetorDouble(aux, "novo");
	}
}
