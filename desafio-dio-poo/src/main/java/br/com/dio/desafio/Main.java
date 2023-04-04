package main.java.br.com.dio.desafio;

import main.java.br.com.dio.desafio.dominio.Bootcamp;
import main.java.br.com.dio.desafio.dominio.Curso;
import main.java.br.com.dio.desafio.dominio.Dev;
import main.java.br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        System.out.println("Projeto DIO Bootcamp");

        Curso cursoJava = new Curso();
        cursoJava.setTitulo("curso java");
        cursoJava.setDescricao("descrição curso java");
        cursoJava.setCargaHoraria(8);

        Curso cursoSpring = new Curso();
        cursoSpring.setTitulo("curso Spring");
        cursoSpring.setDescricao("descrição curso Spring Framework");
        cursoSpring.setCargaHoraria(15);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição da mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(cursoSpring);
        System.out.println("-------");
        System.out.println(mentoria);



        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoSpring);
        bootcamp.getConteudos().add(mentoria);

        Dev devLeo = new Dev();
        devLeo.setNome("Leandro");
        devLeo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Leandro:" + devLeo.getConteudosInscritos());
        devLeo.progredir();
        devLeo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Leandro:" + devLeo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Leandro:" + devLeo.getConteudosConcluidos());
        System.out.println("XP:" + devLeo.calcularTotalXp());

        System.out.println("");
        System.out.println("");

        Dev devFulano = new Dev();
        devFulano.setNome("Fulano de tal");
        devFulano.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Fulano:" + devFulano.getConteudosInscritos());
        devFulano.progredir();
        devFulano.progredir();
        devFulano.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Fulano:" + devFulano.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Fulano:" + devFulano.getConteudosConcluidos());
        System.out.println("XP:" + devFulano.calcularTotalXp());
    }
}
