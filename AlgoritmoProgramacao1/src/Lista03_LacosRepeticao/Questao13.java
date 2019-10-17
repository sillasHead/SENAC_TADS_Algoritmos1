package Lista03_LacosRepeticao;

import java.util.Scanner;

public class Questao13 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double n = in.nextDouble(), numerador = 1, denominador = 1, soma = 0;

		for(double i = 1; i <= n; i++){
			numerador *= i;
			denominador *= 2*i-1;

			soma += numerador/denominador;
		}		
		
		System.out.println(soma); 

		in.close();
	}
}
