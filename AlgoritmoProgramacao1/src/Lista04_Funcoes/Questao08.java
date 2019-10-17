package Lista04_Funcoes;

import java.util.Scanner;

/**
 * Questao08
 */
public class Questao08 {

    static boolean primo(int n){
        int divisores = 0;

        for (int i = 1; i <= n; i++) 
            if(n%i == 0)
                divisores++;
        
        return String.valueOf(divisores).equals("2");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(primo(in.nextInt()));

        in.close();
    }
}