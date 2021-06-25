package ExerciciosPropostos;

import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;
import java.util.*;

public class ExercicioPropostoEstadosNE {
    public static void main(String[] args) {

        /*Dada a população estimada de alguns estados do nordeste brasileiro, faça:
        Estado = PE - população = 9.616.621
        Estado = AL - população = 3.351.543
        Estado = CE - população = 9.187.103
        Estado = RN - população = 3.534.265*/

        System.out.println("-- Crie um Dicionario e relacione os estados com a suas populações -- : ");
        Map<String,Double>  populacaoEstado = new HashMap<>(){{
            put("PE",9.616621);
            put("AL",3.351543);
            put("CE",9.187103);
            put("RN",3.534265);
            put("PB",4.039277);
        }};
        System.out.println(populacaoEstado);
        System.out.println(" ");

        System.out.println("-- Substitua a população do estado RN por 3.534.165 -- ");
        populacaoEstado.put("RN",3.534165);
        System.out.println(populacaoEstado);
        System.out.println(" ");

        System.out.println(" --  Confira se o estado PB está no dicionario: -- " + populacaoEstado.containsKey("PB"));
        System.out.println(" ");

        System.out.println(" -- Exiba a população do estado de PE: --  ");
        System.out.println(populacaoEstado.get("PE"));
        System.out.println(" ");

        System.out.println(" -- Exiba todos os estados e suas populações na ordem que foi informados: -- ");
        Map<String,Double> populacaoEstado1 = new LinkedHashMap<>(){{
            put("PE",9.616621);
            put("AL",3.351543);
            put("CE",9.187103);
            put("RN",3.534265);
            put("PB",4.039277);
        }};
        for(Map.Entry<String,Double> populacaoNe : populacaoEstado1.entrySet())
            System.out.println(populacaoNe.getKey() + " - " + populacaoNe.getValue());
        System.out.println(" ");

        System.out.println(" -- Exiba todos os estados e suas populações em ordem alfabética: -- ");
        Map<String,Double> populacaoEstado2 = new TreeMap<>(populacaoEstado1);
        for(Map.Entry<String, Double> populacaoNe : populacaoEstado2.entrySet())
            System.out.println(populacaoNe.getKey() + " - " + populacaoNe.getValue());
        System.out.println(" ");

        System.out.println(" -- Exiba o estado com menor população e sua quantidade: -- ");
        Double estadoMenorPopulacao = Collections.min(populacaoEstado1.values());
        String menorPopulacaoEstado = "";
        for(Map.Entry<String, Double> entry : populacaoEstado1.entrySet()){
            if (entry.getValue().equals(estadoMenorPopulacao)){
                menorPopulacaoEstado = entry.getKey();
                System.out.println("Estado com menor população: " + menorPopulacaoEstado + " - " + estadoMenorPopulacao);
            }
        }
        System.out.println(" ");

        System.out.println(" -- Exiba o estado com maior população e sua quantidade: -- ");
        Double estadoMaispopuloso = Collections.max(populacaoEstado.values());
        Set<Map.Entry<String, Double>> entries = populacaoEstado.entrySet();
        String maiorpopulacaoEstado = "";

        for(Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(estadoMaispopuloso)) {
                maiorpopulacaoEstado = entry.getKey();
                System.out.println("O estado mais populoso é : " + maiorpopulacaoEstado + " - " + estadoMaispopuloso);
            }
        }
        System.out.println(" ");

        System.out.println(" -- Exiba a soma da população de todos os estados: -- ");
        Iterator<Double> iterator = populacaoEstado.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("A soma da população de todos os estados é de : " + soma);

        System.out.println(" ");

        System.out.println(" -- Exiba a media da população deste dicionario de todos os estados: -- " + (soma/populacaoEstado.size()));
        System.out.println(" ");

        System.out.println(" -- Remova os estados com a população menor que 4.000.000: -- ");
        Iterator<Double> iterator1 = populacaoEstado.values().iterator();
        while(iterator1.hasNext()){
            if(iterator1.next().equals(4.000000))
                iterator1.remove();
        }
        System.out.println(populacaoEstado);
        System.out.println(" ");

        System.out.println(" -- Remova todo o dicionario: -- ");
        populacaoEstado.clear();

        System.out.println(" ");

        System.out.println(" -- Verifique se o dicionario está vazio: -- " + populacaoEstado.isEmpty());








    }
}
