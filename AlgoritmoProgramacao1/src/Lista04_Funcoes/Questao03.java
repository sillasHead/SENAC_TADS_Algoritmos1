package Lista04_Funcoes;

import java.util.Scanner;

/**
 * Questao03
 */
public class Questao03 {

    static int fatorial(int n){
        int fatorial = 1;

        for (int i = 1; i <= n; i++) 
            fatorial *= i;
        
        return fatorial;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(fatorial(in.nextInt()));

        in.close();
    }
}