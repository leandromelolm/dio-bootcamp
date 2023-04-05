package desafio_basicos;

import java.util.Scanner;

public class Desafio_3_soma_de_h_com_n_termos {
    public static void main(String[] args) {
        double h = 0;
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        double t = 0;
        double hx = 0;
        for (int i = 1; i <= n; i++) {
            //TODO: Calcule o valor de H de forma que resulte na soma dos termos:
            t = (100/i);
            hx = hx + t;
        }
        //TODO: Imprima a soma dos termos, considerando um resultado com duas casas decimais:
        h = hx/100;
        System.out.println(String.format("%.0f", h));
    }
}