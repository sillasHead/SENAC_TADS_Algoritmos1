package Lista04_Funcoes;

import java.util.Scanner;

/**
 * Questao05
 */
public class Questao05 {


    static double maiorRaiz(double a, double b, double c){
        if(a == 0)
            return -1;
        
        else{
            double delta = b*b-(4*a*c);

            return (-b + Math.sqrt(delta)) / (2 * a);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(maiorRaiz(in.nextDouble(), in.nextDouble(), in.nextDouble()));

        in.close();
    }
}