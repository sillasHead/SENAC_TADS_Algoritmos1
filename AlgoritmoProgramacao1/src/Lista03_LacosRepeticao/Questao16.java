package Lista03_LacosRepeticao;

import java.util.Scanner;

public class Questao16 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Quantos números deseja consultar? ");
		int n = in.nextInt(), teste;

		do{
			System.out.print("n = ");
			teste = in.nextInt();
			
			if(teste == 0)
				System.out.println("NULO!\n");
			
			else{
				if(teste%2 == 0)
					System.out.print("É PAR E ");
				else
					System.out.print("É IMPAR E ");
				
				if(teste > 0)
					System.out.println("POSITIVO!\n");
				else
					System.out.println("NEGATIVO!\n");
			}

			n--;
		}while(n > 0);

		in.close();
	}
}
