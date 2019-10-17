package Lista04_Funcoes;

import java.util.Scanner;

/**
 * Questao04
 */
public class Questao04 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println(Questao03.fatorial(in.nextInt())/Questao02.somatoria(in.nextInt()));

        in.close();
    }
}