package Lista01;

import java.util.Scanner;

public class Questao09 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String ls = System.getProperty("line.separator");
		
		System.out.println("Para calcular o salário do funcionário, insira as seguintes informações:" + ls);
		
		System.out.print("Número de cadastro do funcionário: ");
		String cadastro = in.next();
		
		System.out.print("Quantidade de horas trabalhadas: ");
		double horasTrabalhadas = in.nextDouble();
		
		System.out.print("Valor recebido por hora trabalhada: R$");
		double valorHora = in.nextDouble();
		
		System.out.println(ls + "Número de cadastro do funcionário: " + cadastro);
		System.out.println("Salário desse funcionário: R$" + String.format("%.2f", horasTrabalhadas*valorHora));		
		
		in.close();
	}
}
