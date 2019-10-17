package Lista03_LacosRepeticao;

import java.util.Scanner;

public class Questao14 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
  
		double n = in.nextDouble(), soma = 1;

		for(double i = 1; i <= n; i++)
			soma += (i*2)/(i*2+1);
		

		System.out.print(soma);

		in.close();
	}
}
