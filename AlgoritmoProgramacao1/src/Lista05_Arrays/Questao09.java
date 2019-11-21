package Lista05_Arrays;

public class Questao09 {
	public static void main(String[] args) {
		Funcoes f = new Funcoes();
		
		int[] a = f.criarVetorInt();
		int[] b = a;
		int[] c = new int[a.length];
		
		f.exibirVetorInt(a, "A");
		
		f.exibirVetorInt(b, "B");
		
		for(int i = 0; i < a.length; i++) {
			c[i] = a[i] * b[i];
		}
		
		f.exibirVetorInt(c, "C");		
	}
}
