package Lista02_Switch;

import java.util.Scanner;

public class Questao08 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double valorInicial, juros;

		System.out.print("Valor da multa: R$ ");
		valorInicial = in.nextDouble();

		System.out.print("Mês do pagamento: ");
		String mes = in.next().toLowerCase();
		juros = 1.05;

		switch (mes) {
		case "janeiro":
		case "1":
			System.out.printf("Valor total a ser pago: R$" + "%.2f", valorInicial);
			break;

		case "fevereiro":
		case "2":
			valorInicial *= Math.pow(juros, 1);
			System.out.printf("Valor total a ser pago: R$" + "%.2f", valorInicial);
			break;

		case "março":
		case "3":
			valorInicial *= Math.pow(juros, 2);
			System.out.printf("Valor total a ser pago: R$" + "%.2f", valorInicial);
			break;

		case "abril":
		case "4":
			valorInicial *= Math.pow(juros, 3);
			System.out.printf("Valor total a ser pago: R$" + "%.2f", valorInicial);
			break;

		case "maio":
		case "5":
			valorInicial *= Math.pow(juros, 4);
			System.out.printf("Valor total a ser pago: R$" + "%.2f", valorInicial);
			break;

		case "junho":
		case "6":
			valorInicial *= Math.pow(juros, 5);
			System.out.printf("Valor total a ser pago: R$" + "%.2f", valorInicial);
			break;

		case "julho":
		case "7":
			valorInicial *= Math.pow(juros, 6);
			System.out.printf("Valor total a ser pago: R$" + "%.2f", valorInicial);
			break;

		case "agosto":
		case "8":
			valorInicial *= Math.pow(juros, 7);
			System.out.printf("Valor total a ser pago: R$" + "%.2f", valorInicial);
			break;

		case "setembro":
		case "9":
			valorInicial *= Math.pow(juros, 8);
			System.out.printf("Valor total a ser pago: R$" + "%.2f", valorInicial);
			break;

		case "outrubro":
		case "10":
			valorInicial *= Math.pow(juros, 9);
			System.out.printf("Valor total a ser pago: R$" + "%.2f", valorInicial);
			break;

		case "novembro":
		case "11":
			valorInicial *= Math.pow(juros, 10);
			System.out.printf("Valor total a ser pago: R$" + "%.2f", valorInicial);
			break;

		case "dezembro":
		case "12":
			valorInicial *= Math.pow(juros, 11);
			System.out.printf("Valor total a ser pago: R$" + "%.2f", valorInicial);
			break;

		default:
			System.out.print("Mês inválido");
		}
		
		in.close();
	}
}
