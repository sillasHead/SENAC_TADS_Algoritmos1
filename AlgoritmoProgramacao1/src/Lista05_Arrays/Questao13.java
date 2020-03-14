package Lista05_Arrays;

public class Questao13 {
	public static void main(String[] args) {
		Funcoes f = new Funcoes();
		int[] a = f.criarVetorInt();
		f.exibirVetorInt(a, "A");
		
		int[] b = f.criarVetorInt();
		f.exibirVetorInt(b, "B");
		
		
		
		int[] c = new int[a.length + b.length];		
		
		for(int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		
		for(int i = 0; i < b.length; i++) {
			c[i + a.length] = a[i];
		}
		
		f.exibirVetorInt(c, "C");
	}
}
