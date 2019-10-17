package Lista04_Funcoes;

import java.util.Scanner;

/**
 * Questao02
 */
public class Questao02 {

    static int somatoria(int n){
        int somatoria = 0;
        
        for(int i = 1; i <= n; i++)
            somatoria += i;
        
        return somatoria;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(somatoria(in.nextInt()));

        in.close();
    }
}