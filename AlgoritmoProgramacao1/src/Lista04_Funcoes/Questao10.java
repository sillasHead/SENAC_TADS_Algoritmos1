package Lista04_Funcoes;

import java.util.Scanner;

/**
 * Questao10
 */
public class Questao10 {

    static String categoria(int idade){
        if (idade >= 5 && idade <= 7) 
            return "Infantil A";

        else if (idade >= 8 && idade <= 10)
            return "Infantil B";

        else if (idade >= 11 && idade <= 13)
            return "Juvenil A";

        else if (idade >= 14 && idade <= 17)
            return "Juvenil B";

        else if (idade > 5)
            return "Adulto";

        else
            return "ET";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(categoria(in.nextInt()));

        in.close();
    }
}