package AulasDioCollectionsSet;

import java.util.*;

public class Exemplo_Set {

    public static void main(String[] args) {

        // Set - Não permite elementos duplicados
        //- Não possui indice  e mostra tudo aleatorio
        System.out.println("Crie um conjunto e adicione notas.");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());

        //- Com Set Não tem como pois Não possui indice
        System.out.println("Exiba a posição da nota 5.0");

        //- Com Set Não tem como pois Não possui indice
        System.out.println("Adiciona na lista a nota 8.0 na posição 4");

        //Retorna boolean true or false
        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5d));

        //Exibindo a menor nota atraves da .min collections, set pertence a collections
        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        //Exibindo a maior nota atraves da .max collections, set pertence a collections
        System.out.println("Exiba a maior nota: " + Collections.max(notas));


        //Exiba a soma dos valores
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        //Para saber a média é soma / notas.size() que é o tamanho
        System.out.println("Exiba a média das notas: " + (soma / notas.size()));

        //para remover é o metodo .remove()
        System.out.println("Remova a nota 0.0 da lista: " );
        notas.remove(0d);
        System.out.println(notas);

        //Usa-se o iterator, quando o proximo (iterator.hasNext) criou uma variavel next que recebe iterator.next e faço um if para saber que se
        //next for menor que 7 o iterator remove
        System.out.println("Remova notas menores que 7: " + soma);
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        //Set<Double> notas2 = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        //OU
        //Como o método set não armazena valores duplicados ele so armazenou um 7.0 mesmo que eu digita 10 ele so vai armazenar um
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);

        System.out.println(notas2);

        //Ordem crescente, ele so deu certo pq o notas2 que é do tipo double tem o comparable. Se nã tivesse nao ia dar certo
        System.out.println("Exiba todas as notas em crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        //Apaga o objeto
        System.out.println("Apagar todo o conjunto: " );
        notas2.clear();


        //Verifica se tem algo, retorna boolean
        System.out.println("Verificar se o conjunto está vazio " + notas.isEmpty());
        System.out.println("Verificar se o conjunto está vazio " + notas2.isEmpty());
        System.out.println("Verificar se o conjunto está vazio " + notas3.isEmpty());

    }


}
