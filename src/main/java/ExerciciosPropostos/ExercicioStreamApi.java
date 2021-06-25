package ExerciciosPropostos;


import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class ExercicioStreamApi {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1","0","4","1","2","3","9","9","6","5");

        //Lambda
        System.out.println(" - Imprima todos os elementos dessa lista de String: -  ");
        //numerosAleatorios.stream().forEach(System.out::println); essa llinha é a mesma coisa da debaixo
        numerosAleatorios.forEach(System.out::println);
        System.out.println(" ");

        //Como o Set não aceita numeros repetidos entao ele vai imprimir em ordem crescente 0,1,2,4 e no numero 1 somente uma vez
        System.out.println(" - Pegue os 5 primeiros numeros e coloque dentro de um Set: -  ");
        //Set<String> collectSet = numerosAleatorios.stream().limit(5).collect(Collectors.toSet());  essa llinha é a mesma coisa da debaixo
        numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);
        System.out.println(" ");

        System.out.println(" -Transforme esta lista de String em uma lista de numeros inteiros: -  ");
        numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList()).forEach(System.out::println);
        //            OU dessa maneira embaixo:

        //List<Integer> numerosAleatorios1 = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());

        // OU dessa maneira embaixo:

//        numerosAleatorios.stream().map(new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                return Integer.parseInt(s);
//            }

        System.out.println(" ");

        System.out.println(" -Pegue os numeros pares e maiores que 2 e coloque em uma lista: -  ");
        numerosAleatorios.stream().map(Integer::parseInt).filter(i -> i % 2 == 0 && i >2).collect(Collectors.toList()).forEach(System.out::println);

        // OU criando uma variavel para mostrar a lista:
//        List<Integer> listaMaioresQue2 = numerosAleatorios.stream().map(Integer::parseInt).filter(i -> i % 2 == 0 && i > 2).collect(Collectors.toList());
//        System.out.println(listaMaioresQue2);

        System.out.println(" ");

        System.out.println(" -Mostre a média dos numeros: -  ");
//        numerosAleatorios.stream().mapToInt(new ToIntFunction<String>() {
//            @Override
//            public int applyAsInt(String s) {
//                return Integer.parseInt(s);
//            }
//        });      OU da forma abaixo:
        numerosAleatorios.stream().mapToInt(Integer::parseInt).average().ifPresent(System.out::println);

        System.out.println(" ");

        System.out.println(" -Remova os valores Impares: -  ");
        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());
        numerosAleatoriosInteger.removeIf(i -> i % 2 != 0);
        System.out.println(numerosAleatoriosInteger);

        System.out.println(" ");

        System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante:");
        numerosAleatoriosInteger.stream()
                .skip(3)
                .forEach(System.out::println);

        long countNumerosUnicos = numerosAleatoriosInteger.stream()
                .distinct()
                .count();

        System.out.println(" ");
        System.out.println("Retirando os números repetidos da lista, quantos números ficam? " + countNumerosUnicos);

        System.out.println(" ");
        System.out.print("Mostre o menor valor da lista: ");
        numerosAleatoriosInteger.stream()
                .mapToInt(Integer::intValue)
                .min()
                .ifPresent(System.out::println);

        System.out.println(" ");
        System.out.print("Mostre o maior valor da lista: ");
        numerosAleatoriosInteger.stream()
                .mapToInt(Integer::intValue)
                .max()
                .ifPresent(System.out::println);;

        int somaDosNumerosPares = numerosAleatoriosInteger.stream()
                .filter(i -> (i % 2 == 0))
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Pegue apenas os números ímpares e some: " + somaDosNumerosPares);

        System.out.println(" ");
        System.out.println("Mostre a lista na ordem númerica: ");
        List<Integer> numerosOrdemNatural = numerosAleatoriosInteger.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(numerosOrdemNatural);

        System.out.println(" ");
        System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5:");
//        dica: collect(Collectors.groupingBy(new Function())
        Map<Boolean, List<Integer>> collectNumerosMultiplosDe3E5 = numerosAleatoriosInteger.stream()
                .collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));
        System.out.println(collectNumerosMultiplosDe3E5);
    }
}