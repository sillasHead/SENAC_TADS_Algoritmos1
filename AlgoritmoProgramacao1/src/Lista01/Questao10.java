package Lista01;

import java.util.Scanner;

public class Questao10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String ls = System.getProperty("line.separator");

		System.out.println("Quer saber qual ser� o seu sal�rio ao final do m�s? Eu calculo para voc�!" + ls);

		System.out.println("Qual � o seu nome?");
		String nome = in.nextLine();

		System.out.print(ls + "Qual � o seu sal�rio fixo?" + ls + "R$");
		double salario = in.nextDouble();

		System.out.print(ls + "Qual foi o total de vendas (em dinheiro) que voc� efetuou no m�s?" + ls + "R$");
		double totalVendas = in.nextDouble();

		System.out.println(ls + nome + ", confira o valor total a receber:");
		System.out.printf("R$" + "%.2f", (salario + totalVendas * 0.15));
	}
}
