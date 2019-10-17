package Lista04_Funcoes;

import java.util.Scanner;

/**
 * Questao09
 */
public class Questao09 {

    static int idadeEmDias(int anos, int meses, int dias){
        return anos*365 + meses*30 + dias;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(idadeEmDias(in.nextInt(), in.nextInt(), in.nextInt()));

        in.close();
    }
}