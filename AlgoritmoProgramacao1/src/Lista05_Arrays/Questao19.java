package Lista05_Arrays;

public class Questao19 {
	public static void main(String[] args) {
		Funcoes f = new Funcoes();
		
		int[] v = f.criarVetorInt();
		
		f.exibirVetorInt(v, "");
		
		for (int i = 0; i < v.length; i = i + 2) {
			System.out.println(v[i]);
		}
	}
}
