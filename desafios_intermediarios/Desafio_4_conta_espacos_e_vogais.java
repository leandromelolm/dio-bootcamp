package desafios_intermediarios;

import java.util.Scanner;

public class Desafio_4_conta_espacos_e_vogais {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strSplit = str.split(" ");
        char[] arrVogais = {'a', 'e', 'i', 'o', 'u'};
        int espacosEmBranco = strSplit.length - 1, quantVogais = 0;

        for (String item : strSplit) {

            //TODO: Implemente condições (laços) adequados para que possamos contar os espaços em brancos e as vogais que existem na string.
            //Dica: Você pode utilizar o Character.toLowerCase em sua condição:
            for (int i = 0; i < item.length(); i++) {
                for (int x = 0; x < arrVogais.length; x++) {
                    if (arrVogais[x] == item.toLowerCase().charAt(i)) {
                        quantVogais++;
                    }
                }
            }

        }
        System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);
    }
}
