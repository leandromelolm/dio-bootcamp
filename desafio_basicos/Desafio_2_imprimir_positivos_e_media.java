package desafio_basicos;

import java.util.Scanner;

public class Desafio_2_imprimir_positivos_e_media {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        double media = 0;
        double x;

        //TODO: Implemente as condições adequadas para obter a quantidade
        //de valores positivos e a média dos valores positivos:
        double total =0;
        for (int i = 0; i < 6; i++) {
            x = leitor.nextDouble();
            if ( x > 0){
                total = total + x;
                cont = cont + 1;
            }
        }

        media = total/cont;
        System.out.println(cont + " valores positivos");
        System.out.println(String.format("%.1f", media));
    }
}