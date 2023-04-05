package desafios_intermediarios;

import java.util.Scanner;

public class Desafio_3_triangulo {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();
        double maior;
        double soma;
        boolean triangulo;

//TODO: Implemente a condição necessária para o cálculo do triângulo:
//Dica: Você pode utilizar o String.format() na formatação do texto.

        triangulo = B + C > A;

        if(triangulo){
            System.out.println("Perimetro = "+(A + B + C));
        }else{
            System.out.println("Area = "+((A + B) * C) / 2);
        }
    }
}
