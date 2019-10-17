package Lista03_LacosRepeticao;

import java.util.Scanner;

public class Questao11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double n = in.nextDouble(), soma = 0;

		for(double i = 1; i <= n; i++){
			if(i%2 == 0)
				soma += 1/-i;
			else
				soma += 1/i;
		}

		System.out.print(soma);

		in.close();
	}
}