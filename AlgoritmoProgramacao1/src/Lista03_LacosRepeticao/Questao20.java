package Lista03_LacosRepeticao;

import java.util.Scanner;

public class Questao20 {
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    	
    	System.out.print("Digite o seu saldo: ");
		double saldo = in.nextDouble();
		String operacao;

		do{
	    	System.out.print("\nEscolha uma das seguintes opções..."
	    			       + "\n"
			               + "\n<1> Depósito"
					       + "\n<2> Saque"
					       + "\n<3> Sair"
					       + "\n"
					       + "\nOpçõo: ");
			operacao = in.next();

			switch(operacao){
			case "1":
				System.out.print("Valor do Depósito: ");
				saldo += in.nextDouble();
				System.out.println("Saldo atualizado: " + saldo);
				break;

			case "2":
				System.out.print("Valor do Saque: ");
				saldo -= in.nextDouble();
				System.out.println("Saldo atualizado: " + saldo);
			}
		}while(!(operacao.equals("3")));

		if(saldo == 0)
			System.out.print("\nCONTA ZERADA");
		else if(saldo < 0)
			System.out.print("\nCONTA ESTOURADA");
		else
			System.out.print("\nCONTA PREFERENCIAL");

		in.close();
	}
}
