package Lista03_LacosRepeticao;

import java.util.Scanner;

public class Questao18 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de elementos que deseja ver da série Fibonacci..."
					 + "\nA quantidade deve ser menor que 46!"
					 + "\n"
					 + "qtd: ");
		int n = in.nextInt(), a = 0, b = 1;

		for(int i = 1; i <= n; i++){
			System.out.println(a);
			a += b;
			b = a-b;
		}

		in.close();
	}
}
