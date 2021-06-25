package AulasDioCollectionsMap;

import java.util.Comparator;
import java.util.Map;

public class ComparatorNome implements Comparator <Map.Entry<String, Livros>> {
    @Override
    public int compare(Map.Entry<String, Livros> l1, Map.Entry<String, Livros> l2) {
        // Aqui to comparando o l1, valor dele que quero comparar é o nome comparando com o l2 valor nome
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}
