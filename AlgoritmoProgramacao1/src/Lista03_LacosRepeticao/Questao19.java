package Lista03_LacosRepeticao;

import java.util.Scanner;

public class Questao19 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Insira a senha para aceder ao acesso!"
		             + "\nSenha: ");

		while(!("2002".equals(in.next()))) {
			System.out.println("Senha Inválida");
			System.out.print("\nSenha: ");
		}
		
		System.out.println("Acesso Permitido");

		in.close();
	}
}
