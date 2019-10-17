package Lista03_LacosRepeticao;

import java.util.*;

public class Questao06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String nome = "", sexo = "";
		int idade1, idade2 = 0, contador = 1;

		do{	System.out.print("Insira os dados do " + contador + "º aluno"
						 + "\nIdade: ");
			idade1 = in.nextInt();

			if(idade1 > idade2){
				idade2 = idade1;

				in.nextLine();
				System.out.print("Nome: ");
				nome = in.nextLine();

				System.out.print("Sexo: ");
				sexo = in.next();
				
			} else {
				in.nextLine();
				System.out.print("Nome: ");
				in.nextLine();

				System.out.print("Sexo: ");
				in.next();				
			}

			System.out.print("\n");
			contador++;
		}while(contador <= 5); 

		System.out.print("Dados do primeiro aluno mais velho"
					 + "\nIdade: " + idade2
					 + "\nNome: " + nome
					 + "\nSexo: " + sexo);

		in.close();
	}
}