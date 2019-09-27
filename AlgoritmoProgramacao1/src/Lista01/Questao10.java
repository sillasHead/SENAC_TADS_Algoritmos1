package Lista01;

import java.util.Scanner;

public class Questao10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String ls = System.getProperty("line.separator");

		System.out.println("Quer saber qual será o seu salário ao final do mês? Eu calculo para você!" + ls);

		System.out.println("Qual é o seu nome?");
		String nome = in.nextLine();

		System.out.print(ls + "Qual é o seu salário fixo?" + ls + "R$");
		double salario = in.nextDouble();

		System.out.print(ls + "Qual foi o total de vendas (em dinheiro) que você efetuou no mês?" + ls + "R$");
		double totalVendas = in.nextDouble();

		System.out.println(ls + nome + ", confira o valor total a receber:");
		System.out.printf("R$" + "%.2f", (salario + totalVendas * 0.15));
	}
}
