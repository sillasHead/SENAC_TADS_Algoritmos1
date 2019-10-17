package Lista04_Funcoes;

import java.util.Scanner;

/**
 * Questao13
 */
public class Questao13 {

    static int qtdDivisores(int n){
        int qtdDivisores = 0;

        for (int i = 1; i <= n; i++) 
            if (n%i == 0) 
                qtdDivisores++;
            
        return qtdDivisores;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(qtdDivisores(in.nextInt()));

        in.close();
    }
}