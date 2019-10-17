package Lista03_LacosRepeticao;

import java.util.Scanner;

public class Questao09 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Insira a quantidade de alunos: ");
		int qtd = in.nextInt(), i = 1;
		double soma = 0;
		while(i <= qtd){
			System.out.print("Insira a nota do " + i + "º aluno: ");
			soma += in.nextDouble();
			i++;
		}
		if(qtd != 0)
			System.out.print("\nMédia aritmética de todas as notas: " + soma/qtd);
		else
			System.out.print("\nNão há notas para a efetuação do cálculo da média aritmética...");
		
		in.close();
	}
}
