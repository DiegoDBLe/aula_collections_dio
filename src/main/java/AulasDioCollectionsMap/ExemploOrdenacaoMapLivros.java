package AulasDioCollectionsMap;

import java.util.*;

public class ExemploOrdenacaoMapLivros {
     /* Dadas as seguintes informações sobre meus livros favoritos e seus autores,

        - crie um dicionário e ordene este dicionário:
            exibindo (Nome Autor - Nome Livro);
            Autor = Hawking, Stephen - Livro = nome: Uma Breve História do Tempo. páginas: 256
            Autor = Duhigg, Charles - Livro = nome: O Poder do Hábito, paginas: 408
            Autor = Harari, Yuval Noah - Livro = 21 Lições Para o Século 21, páginas: 432   */

    public static void main(String[] args) {

        //Ordem Aleatoria
        System.out.println("--Ordem aleatoria--: ");
        Map<String, Livros> meusLivros = new HashMap<>(){{
            put ("Hawking, Stephen", new Livros("Uma Breve História do Tempo",256));
            put ("Duhigg, Charle", new Livros("O Poder do Hábito",408));
            put ("Harari, Yuval Noah", new Livros("21 Lições Para o Século 21",432));
        }};

        for(Map.Entry<String, Livros> livro : meusLivros.entrySet()) // para imprimir so a chave e do valor so o nome
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome()); // imprimir o valor da chave + nome do livro
        System.out.println(" ");

        //Ordem de Inserção
        System.out.println("--Ordem de Inserção--: ");
        Map<String, Livros> meusLivros1 = new LinkedHashMap<>(){{
            put ("Hawking, Stephen", new Livros("Uma Breve História do Tempo",256));
            put ("Duhigg, Charle", new Livros("O Poder do Hábito",408));
            put ("Harari, Yuval Noah", new Livros("21 Lições Para o Século 21",432));
         }};

        for (Map.Entry<String, Livros> livro : meusLivros1.entrySet())
             System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        System.out.println(" ");

        // Ordem Alfabetica: autores
        System.out.println("--Ordem Alfabetica: autores--: ");
        Map<String, Livros> meusLivros2 = new TreeMap<>(meusLivros1);
        for (Map.Entry<String, Livros> livro : meusLivros2.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        System.out.println(" ");

        // Ordem Alfabetica: autores
        System.out.println("--Ordem Alfabetica: nomes dos livros--: ");

        Set<Map.Entry<String,Livros>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livros> livro : meusLivros3)
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

    }
}
