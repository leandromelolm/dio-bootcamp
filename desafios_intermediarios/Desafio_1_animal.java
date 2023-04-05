package desafios_intermediarios;

import java.util.Scanner;

public class Desafio_1_animal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String AN1, AN2, AN3;

        AN1 = sc.nextLine();
        AN2 = sc.nextLine();
        AN3 = sc.nextLine();

        if (AN1.equals("vertebrado")) {
            if (AN2.equals("ave")) {
                if (AN3.equals("carnivoro")) {
                    System.out.print("aguia");
                }
                if (AN3.equals("onivoro")) {
                    System.out.print("pomba");
                }
            }
            if (AN2.equals("mamifero")) {
                if (AN3.equals("onivoro")) {
                    System.out.print("homem");
                }
                if (AN3.equals("herbivoro")) {
                    System.out.print("vaca");
                }
            }
        }

        if (AN1.equals("invertebrado")) {
            if (AN2.equals("inseto")) {
                if (AN3.equals("hematofago")) {
                    System.out.print("pulga");
                }
                if (AN3.equals("herbivoro")) {
                    System.out.print("lagarta");
                }
            }
            if (AN2.equals("anelideo")) {
                if (AN3.equals("hematofago")) {
                    System.out.print("sanguessuga");
                }
                if (AN3.equals("onivoro")) {
                    System.out.print("minhoca");
                }
            }
        }
    }
}