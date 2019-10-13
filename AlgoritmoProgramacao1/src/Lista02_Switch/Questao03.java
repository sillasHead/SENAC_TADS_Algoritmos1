package Lista02_Switch;

import java.util.Scanner;

public class Questao03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("R$ ");
		int valor = in.nextInt();
		int qtd;

		System.out.println();

		switch (Math.min(valor, 100)) {
		case 100:
			qtd = valor / 100;
			valor -= qtd * 100;
			System.out.println(qtd + " nota(s) de R$ 100.");
		}

		switch (Math.min(valor, 50)) {
		case 50:
			qtd = valor / 50;
			valor -= qtd * 50;
			System.out.println(qtd + " nota(s) de R$ 50.");
		}

		switch (Math.min(valor, 10)) {
		case 10:
			qtd = valor / 10;
			valor -= qtd * 10;
			System.out.println(qtd + " nota(s) de R$ 10.");
		}

		switch (Math.min(valor, 5)) {
		case 5:
			qtd = valor / 5;
			valor -= qtd * 5;
			System.out.println(qtd + " nota(s) de R$ 5.");
		}

		switch (Math.min(valor, 1)) {
		case 1:
			qtd = valor / 1;
			valor -= qtd * 1;
			System.out.println(qtd + " nota(s) de R$ 1.");
		}
		
		in.close();
	}
}
