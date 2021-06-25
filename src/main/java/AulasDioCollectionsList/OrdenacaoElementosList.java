package AulasDioCollectionsList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoElementosList {

    public static void main(String[] args){

        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon",18,"preto"));
            add(new Gato("Simba",6,"tigrado"));
            add(new Gato("Jon",12,"amarelo"));
        }};

        System.out.println("Ordem de inserção: ");
        System.out.println(meusGatos);

        //Para cololar em radoom(aleatorio) usa-se o método collections .shuffle e passa o nome da list como parâmetro
        System.out.println("Ordem Aleatória: ");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        //Para cololar em ordem natural ou seja ordem alfabetica nesse caso nome
        System.out.println("Ordem Natural (nome): ");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        //Para cololar em ordem natural ou seja ordem alfabetica nesse caso cor
        System.out.println("Ordem de cor: ");
       // Collections.sort(meusGatos, new ComparatorCor()); Também funciona
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("Ordem por nome/cor/idade : ");
        // Collections.sort(meusGatos, new ComparatorCor()); Também funciona
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);


    }
}
//Classe Gato feita na mesma da OrdenacaoElementosList para agilizar na aula. Boa prática é outra classe fora dessa
//Para que eu possa organizar de forma natural uma classe eu preciso implementar a interface Comparable<>
//A Interface Comparable<> me obriga a sobrescrever o método compareTo(); que retorna int.
// Esse int que é organizado na ordem, no exemplo queremos comprar nome que é um String

class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    //Sem sobrescrever a classe Gato quando imprimir so aparece o lugar de memória
    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class ComparatorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato>{

    @Override
    public int compare(Gato t1, Gato t2) {
        return t1.getCor().compareToIgnoreCase(t2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato>{

    //Se os nomes forem diferentes vou ordenar por nome, se não, vair verificar a cor,
    // se os nomes forem iguais e as cores forem iguais vai ordenar por cor, se tudo for igual o gato é igual
    @Override
    public int compare(Gato g1, Gato g2) {
       int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
       if(nome != 0) return nome;

       int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
       if(cor != 0) return cor;

       return Integer.compare(g1.getIdade(),g2.getIdade());
    }
}