package Lista05_Arrays;

public class Questao14 {
	public static void main(String[] args) {
		Funcoes f = new Funcoes();
		int[] a = f.criarVetorInt();
		f.exibirVetorInt(a, "A");
		
		int[] b = f.criarVetorInt();
		f.exibirVetorInt(b, "B");
		
		
		
		int[] c = new int[a.length + b.length];		
		
		for(int i = 0; i < c.length; i += 2) {
			c[i] = a[i/2];
			c[i + 1] = b[i/2];
		}
		
		f.exibirVetorInt(c, "C");
	}
}
