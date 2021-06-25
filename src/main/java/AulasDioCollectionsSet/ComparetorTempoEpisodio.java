package AulasDioCollectionsSet;


import java.util.Comparator;

public class ComparetorTempoEpisodio implements Comparator<Serie> {


    @Override
    public int compare(Serie ep1, Serie ep2) {
        int tempoEpisodio = ep1.getTempoEpisodio().compareTo(ep2.getTempoEpisodio());
        if (tempoEpisodio !=0 ) return tempoEpisodio;
        return Integer.compare(ep1.getTempoEpisodio(), ep2.getTempoEpisodio());


    }
}
