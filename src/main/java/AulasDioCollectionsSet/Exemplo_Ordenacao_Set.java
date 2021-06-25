package AulasDioCollectionsSet;

import java.util.*;

public class Exemplo_Ordenacao_Set {
    /*Dada a seguinte informação sobre as series favoritas da professora, crie um conjunto e ordene este conjunto
    exibindo: (nome, genero, tempo de episodio);
    * Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
    * Série 2 = Nome: dark, genero: drama,  tempoEpisodio: 60
    * Série 3 = Nome: that '70s show, genero: comédia, tempoEpisodio: 25
    * */

    public static void main(String[] args) {

        //Tem que criar uma classe para colocar os atributos e fazer um for.
        //Inicia ja instanciando
        System.out.println("Ordem Aleatoria:");

        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("GOT","FANTASIA",60));
            add(new Serie("DARK","DRAMA",60));
            add(new Serie("THAT '70s SHOW ","COMÉDIA",25));

        }};
        for( Serie serie: minhasSeries) System.out.println(serie.getNome() + " - "
                        + serie.getGenero() + " - " + serie.getTempoEpisodio() );

        //**************************************************************************
        System.out.println("*****************************************************************  ");

        System.out.println("Ordem de Inserção:  ");

        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("GOT","FANTASIA",60));
            add(new Serie("DARK","DRAMA",60));
            add(new Serie("THAT '70s SHOW ","COMÉDIA",25));

        }};
        for( Serie serie: minhasSeries) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempoEpisodio() );

        //**************************************************************************
        System.out.println("*****************************************************************  ");

        //Organizar na ordem natural, como o tempo da serie GOT e DARK são o mesmo e o Set não printa ou nao le objetos iguais, entao se faz necessario
        //fazer o seguinte comando sobrescrever no método comprareTo la na classe Serie. tem a implementação correta
        System.out.println("Ordem Natural: (Tempo de Episodio");

        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries);
        for( Serie serie: minhasSeries2) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempoEpisodio() );
        System.out.println(minhasSeries2);

        //**************************************************************************
        System.out.println("*****************************************************************  ");

        System.out.println("Ordem  Nome/Gênero/TempoEpisodio ");

        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparetorNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries);
        for( Serie serie: minhasSeries3) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempoEpisodio() );
        System.out.println(minhasSeries3);

        //**************************************************************************
        System.out.println("*****************************************************************  ");

        System.out.println("Ordem  Gênero ");
        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparetorNome());
        minhasSeries4.addAll(minhasSeries);
        for( Serie serie: minhasSeries4) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempoEpisodio() );
        System.out.println(minhasSeries4);

        //**************************************************************************
        System.out.println("*****************************************************************  ");

        System.out.println("Tempo de Episodio: ");
        Set<Serie> minhasSeries5 = new TreeSet<>(new ComparetorTempoEpisodio());
        minhasSeries5.addAll(minhasSeries);
        for( Serie serie: minhasSeries5) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempoEpisodio() );
        System.out.println(minhasSeries5);

    }


}


