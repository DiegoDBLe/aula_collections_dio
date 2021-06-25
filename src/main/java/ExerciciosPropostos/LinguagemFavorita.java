package ExerciciosPropostos;

import java.time.LocalDate;
import java.util.Objects;

public class LinguagemFavorita implements Comparable<LinguagemFavorita>{

    //crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.

    private String nome;
    private Integer anoDeCriacao;
    private String ide;

    public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public Integer getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", ide ='" + ide + '\'' +
                '}';
    }

    @Override
    public int compareTo(LinguagemFavorita linguagemFavorita) {
        return this.getNome().compareTo(linguagemFavorita.nome);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LinguagemFavorita)) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return nome.equals(that.nome) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
