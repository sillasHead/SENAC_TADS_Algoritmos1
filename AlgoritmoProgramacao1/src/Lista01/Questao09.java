package Lista01;

import java.util.Scanner;

public class Questao09 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String ls = System.getProperty("line.separator");
		
		System.out.println("Para calcular o sal�rio do funcion�rio, insira as seguintes informa��es:" + ls);
		
		System.out.print("N�mero de cadastro do funcion�rio: ");
		String cadastro = in.next();
		
		System.out.print("Quantidade de horas trabalhadas: ");
		double horasTrabalhadas = in.nextDouble();
		
		System.out.print("Valor recebido por hora trabalhada: R$");
		double valorHora = in.nextDouble();
		
		System.out.println(ls + "N�mero de cadastro do funcion�rio: " + cadastro);
		System.out.println("Sal�rio desse funcion�rio: R$" + String.format("%.2f", horasTrabalhadas*valorHora));		
	}
}
