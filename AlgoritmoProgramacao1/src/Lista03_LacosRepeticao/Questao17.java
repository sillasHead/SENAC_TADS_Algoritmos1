package Lista03_LacosRepeticao;

import java.util.Scanner;

public class Questao17 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int n = in.nextInt();
		
		System.out.println("Confira a seguir todos os divisores desse número...");

		for(int i = 1; i <= n; i++)
			if(n%i == 0)
				System.out.println(i);

		in.close();
	}
}
