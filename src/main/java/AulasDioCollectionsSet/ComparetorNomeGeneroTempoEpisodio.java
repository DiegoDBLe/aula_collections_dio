package AulasDioCollectionsSet;

import java.util.Comparator;

public class ComparetorNomeGeneroTempoEpisodio  implements Comparator <Serie> {


    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome !=0 ) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero !=0 ) return genero;
        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());

    // Comparar por nome,genero e tipo e episodio, se o nome das minhas serires forem diferentes eu comparo por nome.
    // Se o nome for igual, vou tentar desempatar com os generos.
    // Se o genero for diferente eu vou comparar por genero.
    //Mas se o nome e o genero forem iguais eu vou comparar por tempo de episodio.
    // Se o tempo de episodio forem iguai e o restante iguais consequentemente a serie é a mesma.
    // coloco o meu construtor ComparetorNomeGeneroTempoEpisodio no meu treeSet.
    // Meu TreeSet estara vaizio, tenho que adicionar elementos nele.
    //Para adicionar elementos uso a variavel local +  a collections .addAll que adiciona todos os elementos passado no parametro
    // nesse caso fica assim minhaSeries3.addAll(minhasSeries); ele pega todos elementos do minhaSerie e adiciona no minhaSerie3


    }
}
