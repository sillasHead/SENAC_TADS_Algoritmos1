package Lista03_LacosRepeticao;

import java.util.Scanner;

public class Questao12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double n = in.nextInt(), soma = 0, n2 = n;
		
		for(double i = 1; i <= n; i++){
			soma += i/(n2);
			n2--; 
		}

		System.out.print(soma);

		in.close();
	}
}
