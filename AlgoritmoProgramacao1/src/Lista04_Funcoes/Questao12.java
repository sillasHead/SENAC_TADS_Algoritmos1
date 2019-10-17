package Lista04_Funcoes;

import java.util.Scanner;

/**
 * Questao12
 */
public class Questao12 {

    static double imc(double alt, String sexo){
        switch (sexo) {
            case "m":
                return 72.7*alt-58;
            
            case "f":
                return 62.1*alt-44.7;

            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(imc(in.nextDouble(), in.next()));

        in.close();
    }
}