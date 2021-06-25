package ExerciciosPropostos;

/* Dadas as seguintes informações de id e contato, crie um dicionário e
        ordene este dicionário exibindo (Nome id - Nome contato);
        id = 1 - Contato = nome: Simba, numero: 2222;
        id = 4 - Contato = nome: Cami, numero: 5555;
        id = 3 - Contato = nome: Jon, numero: 1111; */


import java.util.*;
import java.util.function.Function;

public class ExercicioPropostoAgenda {

    public static void main(String[] args) {

        System.out.println("Ordem Aleatoria: ");
        Map<Integer, Contato> agenda = new HashMap<>() {{
          put( 1, new Contato( 1,"Simba",2222));
          put( 4, new Contato( 4,"Cami",5555));
          put(3, new Contato(3,"Jon",1111));

         }};

        System.out.println(agenda);
        for (Map.Entry<Integer, Contato> entry: agenda.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }
        System.out.println(" ");

        System.out.println("--\tOrdem Inserção\t--");
        Map<Integer, Contato> agenda1 = new LinkedHashMap<>() {{
            put( 1, new Contato( 1,"Simba",2222));
            put( 4, new Contato( 4,"Cami",5555));
            put(3, new Contato(3,"Jon",1111));
        }};
        System.out.println(agenda1);
        for (Map.Entry<Integer, Contato> entry: agenda1.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println(" ");
        System.out.println("--\tOrdem id\t--");
        Map<Integer, Contato> agenda2 = new TreeMap<>(agenda);
        System.out.println(agenda2);
        for (Map.Entry<Integer, Contato> entry: agenda2.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println(" ");
        System.out.println("--\tOrdem número telefone\t--");
        //precisamos organizar os valores. Logo: //Exemplo de classe anonima: Aqui dei um new Comparator e ele ja implementou toda a logica sobescrevendo a lógica. digitei o retorno.
//        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
//            @Override
//            public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
//                return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
//            }
//        });
        //*******************************Simplificando***************************

        //Aqui estou usando o método comparing que pertence ao Comparator, passo como parametro uma function, IDE ja completa, como estou querendo
        // comparar o telefone que é do tipo Integer eu digito Integer. Depois adiciono o metodo apply e faço o retorno que quero comparar o valor,numero
        // de cont
//        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(new Function<Map.Entry<Integer, Contato>, Integer >() {
//            @Override
//            public Integer apply(Map.Entry<Integer, Contato> cont) {
//                return cont.getValue().getNumero();
//            }
//        }));
//        set.addAll(agenda.entrySet());
//        for (Map.Entry<Integer, Contato> entry: set) {
//            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() +
//                    ": " +entry.getValue().getNome());
//        }

        //******************************* Simplificando pro Lambda ***************************

        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(cont -> cont.getValue().getNumero()));

        set.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry: set) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() +
                    ": " +entry.getValue().getNome());
        }



        System.out.println(" ");
        System.out.println("--\tOrdem nome contato\t--");
        //precisamos organizar os valores. Logo: // Aqui nao dei o new Comparator so pra ficar como coparação a implementação acima com essa
        Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(new ComparatorOrdemNomeContato());
        set1.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry: set1) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }
    }
}




