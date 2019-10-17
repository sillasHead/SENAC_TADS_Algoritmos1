package Lista04_Funcoes;

import java.util.Scanner;

/**
 * Questao11
 */
public class Questao11 {

    static String conceito(double mediaFinal){
        if (mediaFinal >= 0 && mediaFinal <= 4.9) 
            return "D";

        else if (mediaFinal >= 5 && mediaFinal <= 6.9)
            return "C";

        else if (mediaFinal >= 7 && mediaFinal <= 8.9)
            return "B";

        else if (mediaFinal >= 9 && mediaFinal <= 10)
            return "A";

        else 
            return "FRACAÇADO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(conceito(in.nextDouble()));

        in.close();
    }
}