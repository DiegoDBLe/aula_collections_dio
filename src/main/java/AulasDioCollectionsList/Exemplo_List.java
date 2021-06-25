package AulasDioCollectionsList;

import java.util.*;

public class Exemplo_List {

    public static void main (String [] args){

       //Principais métodos da interface List
       /* Formas de criar um List:
          // 1° Forma:
          // List notas = new ArrayList();

        // 2° Forma: Passando o tipo primitivo de notas no paramentro <>
        // List <Double> notas = new ArrayList<>();

        // 3° Froma:Passando o tipo primitivo de notas no paramentro <> e Passando os argumentos no paramentro
         // Arrays.asLista()
        //List <Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5,9.3,7d, 0d, 3.6));

        // 4° Forma:Passando o tipo primitivo de notas no paramentro <> e Passando os argumentos no paramentro
        //Arrays.asLista()..Porém dessa forma não consigo adicionar e nem remover informações da list
       // List <Double> notas = Arrays.asList(7d, 8.5,9.3,7d, 0d, 3.6);
       // notas.add(10d);
       // System.out.println(notas);

        // 5° Forma: Mesma forma da outra, porem não addciona e nem remove nada da lista, ela se torna imutavel.
       // List <Double> notas = List.of (7d, 8.5,9.3,7d, 0d, 3.6);
       // notas.add(10d);
        //notas.remove(7d);
        // System.out.println(notas); */

        List <Double> notas = new ArrayList<Double>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(3.6);
        System.out.println(notas.toString()); // OU System.out.println(notas);

        //Método .indexOf(objeto) mostra o indice que o objeto está
        System.out.println("A nota 5.0 está na posição: " + notas.indexOf(5d));

        //Método .add(indice, elemento(objeto) que qeuro adicionar)
        System.out.println("Adicione a nota 8.0 na posição 4: ");
        notas.add(4,8d);
        System.out.println(notas);

        //Método .set passando como parametro .indexOf(objeto) mostra o indice que o objeto está e faz alteração traves do set
        System.out.println("Substitua a nota 5.0 pelo 6.0: ");
        notas.set(notas.indexOf(5d),6d );
        System.out.println(notas);

        //Método .contains(objeto) verifica se o objeto está na lista(array), retorno é boolean true or false
        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));

        //Feito um for e criando uma variavel local chamada nota para imprimir uma nota abaixo da outra da lista notas
        System.out.println("Imprimindo todas as notas uma abaixo da outra:  ");
        for(Double nota: notas) System.out.println(nota);

        //Método .get passo a posição e ele me retorna o elemento que está na posição
        System.out.println("Exiba a terceira nota: adicionada:  " + notas.get(2));

        //Usa a classe Collections o método min, passando como parâmetro minha list(array) ele vai retornar a menor nota
        System.out.println("Imprima a menor nota: " + Collections.min(notas));

        //Usa a classe Collections o método max, passando como parâmetro minha list(array) ele vai retornar a maior nota
        System.out.println("Imprima a menor nota: " + Collections.max(notas));

        //Método Iterator passando como parâmetro Double dei o nome iterator da variavel local, .iterator.
        // Variavel soma para armazenar as interações de cada nota.
        //laço while (iterator. hasNext() esse método verifica se após a soma da nota tem mais um objeto para somar, se for true ele vai para o proximo.
        //vai somando dentro do laço até que o ultimo numero seja somado e de false o método .next
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba as soma dos valores: + " + soma );

        //Variavel soma/ por nota .size() método .size() retorna inteiro pois é o tamanho da minha list(array)
        System.out.println("Exiba a média dos valores: + " + (soma/notas.size()));

        //Método .remova() pode ser removido atraves desse método tanto o objeto quanto a posição: Nesse exemplo é o objeto
        System.out.println("remova a nota 7.0" );
        notas.remove(7d);
        System.out.println(notas);

        //Método .remova() pode ser removido atraves desse método tanto o objeto quanto a posição: Nesse exemplo é a posição
        System.out.println("remova a nota 7.0" );
        notas.remove(0);
        System.out.println(notas);

        //iterator tem proxima? colocou o proximo dentro da variavel next, iterator esse next é menor q 7 ? Se True .remove, se nao retorne pro laço
        System.out.println("remova as notas menores que 7.0" );
        Iterator<Double> menorQueSete = notas.iterator();
        while(menorQueSete.hasNext()){
            Double next = menorQueSete.next();
            if(next < 7) menorQueSete.remove();
        }
        System.out.println(notas);

        //Método para apagar o array(list)
        System.out.println("remova a Lista" );
        notas.clear();

        //Método retorna boolean
        System.out.println("está vazia ? " + notas.isEmpty() );

























    }
}
