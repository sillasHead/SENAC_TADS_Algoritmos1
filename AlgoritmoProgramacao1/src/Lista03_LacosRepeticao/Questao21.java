package Lista03_LacosRepeticao;

import java.util.Scanner;

public class Questao21 {
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    
	    System.out.print("Digite um número inteiro e eu te direi se ele é perfeito..."
	    		     + "\nNúmero: ");
		int n = in.nextInt(), soma = 0;

		for(int i = 1; i < n; i++){
			if(n%i == 0)
				soma += i;
		}

		if(soma == n && soma != 0)
			System.out.print(soma + " é um número perfeito!");
		else
			System.out.print(n + " não é um número perfeito!");

		in.close();
	}
}
