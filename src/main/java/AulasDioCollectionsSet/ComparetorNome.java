package AulasDioCollectionsSet;

import java.util.Comparator;

public class ComparetorNome implements Comparator<Serie> {


    @Override
    public int compare(Serie g1, Serie g2) {
        int genero = g1.getGenero().compareTo(g2.getGenero());
        if (genero !=0 ) return genero;
        return Integer.compare(g1.getTempoEpisodio(), g2.getTempoEpisodio());
    }
}
