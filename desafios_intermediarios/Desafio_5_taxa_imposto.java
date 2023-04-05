package desafios_intermediarios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Desafio_5_taxa_imposto {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double renda = leitor.nextDouble();
        double imposto;

        //TODO: Agora utilizando estrutura condicional implemente em seu código as condições necessárias para o cálculo da taxa de imposto de renda:
        boolean rendaBaixa = renda <= 2000;
        boolean imposto8 = 2000 < renda && renda <= 3000;
        boolean imposto18 = 3000 < renda && renda <= 4500;
        boolean imposto28 = 4500 < renda;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        if(rendaBaixa){
            System.out.println("Isento");
        }
        if(imposto8){
            double valor = renda - 2000;
            imposto = valor * 0.08;
            System.out.println("R$ " + decimalFormat.format(imposto));
        }
        if(imposto18){
            double valor = renda - 3000;
            imposto = (valor * 0.18) +80;
            System.out.println("R$ " + decimalFormat.format(imposto));
        }
        if(imposto28){
            double valor = renda - 4500;
            imposto = (valor * 0.28) +80 +270;
            System.out.println("R$ " + decimalFormat.format(imposto));
        }
    }
}
