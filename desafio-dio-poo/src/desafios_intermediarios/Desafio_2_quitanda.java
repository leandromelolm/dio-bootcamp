package desafios_intermediarios;

import java.util.Scanner;

public class Desafio_2_quitanda {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int morangos = input.nextInt();
        int macas = input.nextInt();

//TODO: Implemente as condições necessárias para retornar o preço a ser pago pelo cliente, conforme a tabela de preços do seu Zé:
        double preco = 0.0;
        double tMorango = 0.0;
        double tMaca = 0.0;

        if(morangos <= 5){
            preco = 2.5;
            tMorango = (double)morangos * preco;
        }
        if(morangos > 5){
            preco = 2.2;
            tMorango = (double)morangos * preco;
        }

        if(macas <= 5){
            preco = 1.8;
            tMaca = (double)macas * preco;
        }
        if(macas > 5){
            preco = 1.5;
            tMaca = (double)macas * preco;
        }
        double totalPreco = tMaca + tMorango;
        if(totalPreco > 25 || macas+morangos > 8){
            System.out.println(totalPreco* 0.9);
        }else{
            System.out.println(totalPreco);
        }
    }
}
