package ExerciciosPropostos;

import java.util.Objects;

public class Contato {

    private Integer id;
    private String nome;
    private Integer numero;

    public Contato(Integer id, String nome, Integer numero) {
        this.id = id;
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public Integer getId() {
        return id;
    }

    public Integer getNumero() {
        return numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato)) return false;
        Contato contato = (Contato) o;
        return id.equals(contato.id) && nome.equals(contato.nome) && numero.equals(contato.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, numero);
    }

    @Override
    public String toString() {
        return "Contato{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", numero=" + numero +
                '}';
    }
}
