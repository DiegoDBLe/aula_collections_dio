package ExerciciosPropostos;

import java.util.*;

public class ExercicioPropostoLinguagemFavorita {

   /* crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
    Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
    a) Ordem de inserção;
    b) Ordem natural;
    b) Nome;
    c) Gênero;
    d) Tempo de Episódio;
    c) Nome, gênero e tempoEpisodio;
    b) Ordem natural(nome);
    c) IDE;
    d) Ano de criação e nome;
    e) Nome, ano de criação e IDE;
    Ao final, exiba as linguagens no console, um abaixo da outra. */

    public static void main(String[] args) {
        //  crie um conjunto com 3 linguagens
        Set<LinguagemFavorita> minhasLinguagensFavoritas = new HashSet<>(){{
            new LinguagemFavorita("Python", 1991, "Pycharm");
            new LinguagemFavorita("JavaScript", 1995, "Visual Studio Code");
            new LinguagemFavorita("Java",1991, "Ecipse");
        }};

        System.out.println("- Ordem de Inserção: ");
        Set<LinguagemFavorita> minhasLinguagensFavoritas1 = new LinkedHashSet<>(

                Arrays.asList(
                 new LinguagemFavorita("Python",1991,"Pycharm"),
                 new LinguagemFavorita("JavaScript",1995,"Visual Studio Code"),
                 new LinguagemFavorita("Java",1991,"Ecipse"))
        );
            for(LinguagemFavorita linguagem : minhasLinguagensFavoritas1) System.out.println(linguagem);

        System.out.println(" ");

       //Ordem Natural:
        System.out.println("Ordem Natural: Nome");
        Set<LinguagemFavorita> minhasLinguagensFavoritas2 = new TreeSet<>(minhasLinguagensFavoritas);
        for(LinguagemFavorita linguagem : minhasLinguagensFavoritas2) System.out.println(linguagem.getNome()
        + linguagem.getAnoDeCriacao() + linguagem.getIde());

        System.out.println(" ");

        //Ordem IDE:
        System.out.println("Ordem IDE: ");
        Set<LinguagemFavorita> minhasLinguagensFavoritas3 = new TreeSet<LinguagemFavorita>(new ComparatorAnoDeCriacaoENome());
        minhasLinguagensFavoritas3.addAll(minhasLinguagensFavoritas);
        for(LinguagemFavorita linguagem : minhasLinguagensFavoritas3) System.out.println(linguagem.getNome() + linguagem.getAnoDeCriacao() + linguagem.getIde());

        System.out.println("--------\tOrdem Ano de Criacao e Nome\t--------");
        Set<LinguagemFavorita> minhasLinguagensFavoritas4 = new TreeSet<LinguagemFavorita>(new ComparatorAnoDeCriacaoENome());
        minhasLinguagensFavoritas4.addAll(minhasLinguagensFavoritas);
        for (LinguagemFavorita linguagem : minhasLinguagensFavoritas4) System.out.println(linguagem);

        System.out.println("--------\tOrdem Nome - Ano de Criacao - IDE\t--------");
        Set<LinguagemFavorita> minhasLinguagensFavoritas5 = new TreeSet<LinguagemFavorita>(new ComparatorNomeAnoDeCriacaoIde());
        minhasLinguagensFavoritas5.addAll(minhasLinguagensFavoritas3);
        for (LinguagemFavorita linguagem : minhasLinguagensFavoritas5) System.out.println(linguagem);


    }
}


























