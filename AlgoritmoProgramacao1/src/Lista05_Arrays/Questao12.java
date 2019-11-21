package Lista05_Arrays;

public class Questao12 {
	public static void main(String[] args) {
		Funcoes f = new Funcoes();
		int[] v1 = f.criarVetorInt();
		int[] v2 = f.criarVetorInt();
		double soma1 = 0, soma2 = 0;; 
		
		f.exibirVetorInt(v1, "A");
		f.exibirVetorInt(v2, "B");
		
		for(int i = 0; i < v1.length; i++) {
			soma1 += v1[i];
			soma2 += v2[i];
		}
		
		System.out.println("Soma vetor A: " + soma1);
		System.out.println("Media vetor A: " + soma1/v1.length + "\n");
		System.out.println("Soma vetor B: " + soma2);
		System.out.println("Media vetor B: " + soma2/v2.length + "\n\n");
		
		if(soma1 > soma2) {
			System.out.println("Maior soma: " + soma1);
		} else {
			System.out.println("Maior soma: " + soma2);			
		}
		
		if(soma1 > soma2) {
			System.out.println("Menor media: " + soma2/v2.length);
		} else {
			System.out.println("Menor media: " + soma1/v1.length);			
		}
	}
}
