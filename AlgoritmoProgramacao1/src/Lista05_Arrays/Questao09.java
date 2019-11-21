package Lista05_Arrays;

public class Questao09 {
	public static void main(String[] args) {
		Funcoes f = new Funcoes();
		
		int[] a = f.criarVetorInt();
		int[] b = a;
		int[] c = new int[a.length];
		
		System.out.println("Vetor A:");
		
		f.exibirVetorInt(a);
		
		System.out.println("\nVetor B:");
		
		f.exibirVetorInt(b);
		
		for(int i = 0; i < a.length; i++) {
			c[i] = a[i] * b[i];
		}
		
		System.out.println("\nVetor C:");
		
		f.exibirVetorInt(c);		
	}
}
