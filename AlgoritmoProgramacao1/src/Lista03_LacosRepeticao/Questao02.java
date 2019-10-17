package Lista03_LacosRepeticao;

import java.util.Scanner;

public class Questao02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Sn = (a1 + an) x n/2"
				     + "\na1 = 1"
				     + "\nn = ");
		int n = in.nextInt(), contador = 1, soma = 0;

		while(contador <= n){
			soma += contador++;
		}

		System.out.print("an = " + n 
				     + "\n"
				     + "\nSn = " + soma);
		
		in.close();
	}
}
