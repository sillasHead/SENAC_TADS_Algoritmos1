package Lista04_Funcoes;

import java.util.Scanner;

/**
 * Questao14
 */
public class Questao14 {

    static int somaSemCriatividade(int a, int n){
        int soma = 0;
        n--;

        for (int i = a; i <= a+n; i++) 
            soma += i;
        
        return soma;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(somaSemCriatividade(in.nextInt(), in.nextInt()));

        in.close();
    }
}