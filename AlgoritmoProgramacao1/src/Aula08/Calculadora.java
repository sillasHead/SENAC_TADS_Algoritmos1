package Aula08;

import java.util.Scanner;

public class Calculadora {
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		cabecalho();
		controlador(menu(), entradaDados(), entradaDados());
		
		in.close();
	}
	
	static void cabecalho() {
		System.out.println("Cabeçalho()");
		System.out.println( "/*-+/*-+/*-+/*-+/*-+/*-+/*-");
		System.out.println( "/*-+Calculadora Simples+/*-");
		System.out.println( "/*-+/*-+/*-+/*-+/*-+/*-+/*-");
	}
	
	static double entradaDados() {
		System.out.println("entradaDados()");
		System.out.print("Número: ");
		
		return in.nextDouble();
	}
	
	static int menu() {
		System.out.println("menu()");
		System.out.println("1-Adição");
		System.out.println("2-Subtração");
		System.out.println("3-Multiplicação");
		System.out.println("4-Divisão");
		System.out.print("Opção: ");
		return in.nextInt();
	}
	
	static double adicao(double a, double b) {
		System.out.println("adicao()");
		return a + b;
	}
	
	static double subtracao(double a, double b) {
		System.out.println("subtracao()");
		return a - b;
	}
	
	static double multiplicacao(double a, double b) {
		System.out.println("multiplicacao");
		return a * b;
	}
	
	static double divisao(double a, double b) {
		System.out.println("divisao()");
		return a / b;
	}
	
	static void imprimir(double r) {
		System.out.println("imprimir()");
		System.out.println("Resultado: " + r);
	}
	
	static void controlador(int opcao, double a, double b) {
		System.out.println("controlador()");
		
		switch(opcao) {
		case 1:
			imprimir(adicao(a, b));
			break;
		case 2:
			imprimir(subtracao(a, b));
			break;
		case 3:
			imprimir(multiplicacao(a, b));
			break;
		case 4:
			imprimir(divisao(a, b));
		}
	}
}
