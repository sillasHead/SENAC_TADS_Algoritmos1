package Lista04_Funcoes;

import java.util.Scanner;

/**
 * Questao15
 */
public class Questao15 {

    static double pow(double x, double z){
        double potencia = x;

        for (int i = 1; i < z; i++) 
            potencia *= x;

        return potencia;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(pow(in.nextDouble(), in.nextDouble()));

        in.close();
    }
}