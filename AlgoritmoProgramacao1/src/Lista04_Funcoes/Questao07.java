package Lista04_Funcoes;

import java.util.Scanner;

/**
 * Questao07
 */
public class Questao07 {

    static double volume(double raio){
        return raio*4.0/3*Math.PI*Math.pow(raio, 3);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(volume(in.nextDouble()));

        in.close();
    }
}