package Lista04_Funcoes;

import java.util.Scanner;

/**
 * Questao06
 */
public class Questao06 {

    static double maiorRaiz(double a, double b, double c, double d){
        if(a == 0)
            return -1;
        
        else{
            double delta = b*b-(4*a*c);

            if (d == 1) {
                return (-b + Math.sqrt(delta)) / (2 * a);                
            } else
            if (d == 2){
                return (-b - Math.sqrt(delta)) / (2 * a);                                
            } else {
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(maiorRaiz(in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble()));

        in.close();
    }
}