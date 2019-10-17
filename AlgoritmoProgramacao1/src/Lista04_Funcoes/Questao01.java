package Lista04_Funcoes;

import java.util.Scanner;

/**
 * Questao01
 */
public class Questao01 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(menorNumero(in.nextInt(), in.nextInt(), in.nextInt()));
        in.close();
    }

    static int menorNumero(int a, int b, int c){
        return Math.min(Math.min(a, b), c);
    }    
}