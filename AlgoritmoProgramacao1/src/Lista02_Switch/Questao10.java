package Lista02_Switch;

import java.util.Scanner;

public class Questao10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String ls = System.getProperty("line.separator");

		System.out.print("1º número: ");
		double n1 = in.nextDouble();

		System.out.print("2º número: ");
		double n2 = in.nextDouble();

		System.out.println("Escolha uma das operações:" + ls);
		System.out.println("< + > ");
		System.out.println("< - > ");
		System.out.println("< * > ");
		System.out.print("< / > " + ls + ls + "Operação: ");
		String operacao = in.next();

		switch (operacao) {
		case "+":
			System.out.print(ls + n1 + " + " + n2 + " = " + (n1 + n2));
			break;

		case "-":
			System.out.print(ls + n1 + " - " + n2 + " = " + (n1 - n2));
			break;

		case "*":
			System.out.print(ls + n1 + " x " + n2 + " = " + (n1 * n2));
			break;

		case "/":
			System.out.print(ls + n1 + " º " + n2 + " = " + (n1 / n2));
			break;

		default:
			System.out.print(ls + "Operação inválida");
		}
		
		in.close();
	}
}
