package ExerciciosPropostos;

import java.util.Comparator;

public class ComparatorNomeAnoDeCriacaoIde implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        int nome = lf1.getNome().compareToIgnoreCase(lf1.getNome());
        int anoDeCriacao = Integer.compare(lf1.getAnoDeCriacao(), lf2.getAnoDeCriacao());
        if(nome != 0 ) return  nome;
        return lf1.getIde().compareToIgnoreCase(lf2.getIde());
    }
}
