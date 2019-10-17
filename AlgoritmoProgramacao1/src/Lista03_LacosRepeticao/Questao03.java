package Lista03_LacosRepeticao;

import java.util.Scanner;

public class Questao03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n, maiorN = 0;

		System.out.println("Insira 10 números que sejam inteiros e positivos a seguir...\n");

		for (int i = 1; i <= 10; i++) {
			System.out.print(i + "� = ");
			n = in.nextInt();

			if (n > maiorN)
				maiorN = n;
		}

		System.out.print("\nO maior número inserido foi: " + maiorN);
		
		in.close();
	}
}
