package AulasDioCollectionsMap;

import java.util.*;

public class ExemploOrdenacaoMapCarros {

    public static void main(String[] args) {
        /*Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
         modelo = gol - consumo = 14,4km/l
         modelo = uno - consumo = 15,6 km/l
         modelo = mobi - consumo = 16,1 km/l
         modelo = hb20 - consumo = 14,5 km/l
         modelo = kwid - consumo = 15,6 km/l
 */
        // Diferente do Set para adicionar um metóda no lugar de add usa-se put.
        System.out.println("Crie um dicionario que relacione os modelos e seus respectivos consumo: ");
        Map<String,Double> carrosPopulares = new HashMap<>(){{
            put("gol",14.4);
            put("uno",15.6);
            put("mobi",16.1);
            put("hb20",14.5);
            put("kwid",16.5);
        }};
        System.out.println(carrosPopulares.toString());
        System.out.println(" ");

        //Substituindo um valor por outro atraves do comando .put
        System.out.println("Substitua o consumo do gol por 15, 2kml:");
        carrosPopulares.put("gol",15.2);
        System.out.println(carrosPopulares);

        //Verificar se determinado objeto está no dicionario atraves do comando .containsKey() e passa como paramentro o objeto retorno boolean
        System.out.println(" ");
        System.out.println("Verifique se o Tucson está no dicionario: " + carrosPopulares.containsKey("Tucson"));
        System.out.println(" ");

        //Exibi o valor do objeto
        System.out.println("Exiba o consumo do UNO: " + carrosPopulares.get("uno"));
        System.out.println(" ");

        //Exibi todas as key(chaves) adicionadas
        System.out.println("Exiba os modelos adicionado: " + carrosPopulares.keySet());
        System.out.println(" ");

        //Exibi todos os valores(values) adicionadas
        System.out.println("Exiba os valores adicionados: " + carrosPopulares.values());
        System.out.println(" ");

        //Exibi todas as key(chaves) adicionadas e todos os valores(values) adicionadas relacionados carro e consumo
        System.out.println("Exiba as chaves(Key) e os valores(values) relacionados: " + carrosPopulares.entrySet());
        System.out.println(" ");

        // Acessa o maior valor atraves da collections, faz uma varredura no Map atraves do Set, atribui a variavel entries, fora para procurar e o if para atribuir a chave de maior valor que consequentemente é a de melhor consumo
        System.out.println("Exiba o modelo mais economico e seu consumo: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());//Até aqui eu ja tenho acesso ao mais eficiente, ou seja o valor de consumo 16,5 é so printar o consumoMaisEficiente
        Set<Map.Entry<String,Double>> entries = carrosPopulares.entrySet();//Aqui dou um Set para entar no Map passando como parametros as variaveis que meu Map é crio uma variavel local que recebe carrosPopulares e o método .entrySet()
        String modeloMaisEficiente = " ";// Variavel de controle

        for (Map.Entry<String,Double> entry : entries) { //Aqui ele vai procurar na minha variavel entries que esta associada a carrosPopilares.entrySet e vai retornar o de consumo 16,5
            if(entry.getValue().equals(consumoMaisEficiente)){ //Aqui ele verifica se o valor do entry da variavel consumoEficiente da colleciotns.max ou seja o maior numero
                modeloMaisEficiente = entry.getKey();// Aqui a variavel de controle vai receber o valor da chave da variavel entry > entries > carrosPopulares.entrySet > Collections.max
                System.out.println("Modelo mais Eficiente " + modeloMaisEficiente + " - " + consumoMaisEficiente);
        }
        }

        //Modelo menos eficiente aqui trabalha valor e chave separadamente
        System.out.println(" ");
        System.out.println("Exiba o modelo menos economico e seu consumo: " );
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String,Double> entry: carrosPopulares.entrySet()){
            if(entry.getValue().equals(consumoMenosEficiente)){ //Se esse meu entry que eu peguei aqui se o valor dele for igual ao meu consumo menos eficiente, eu vou dizer que a chave que liga a esse valor tambem é o modelo menos eficiente
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente e seu consumo: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
            }
        }
        System.out.println(" ");
        System.out.println("Exiba a soma dos consumos: " );
        Iterator<Double> iterator = carrosPopulares.values().iterator();//Só conseguimos chamar o iterator aqui pq o retorno é uma collections.
        Double soma = 0d;
        while (iterator.hasNext()){ // O iterator tem proximo? enquanto tiver soma com proximo iterator.next();
            soma += iterator.next();
        }
        System.out.println(soma + "KmL");

        // Média dos consumos
        System.out.println(" ");
        System.out.println("Exiba a média dos consumos: " + (soma/carrosPopulares.size()) + "Kml");

        System.out.println(" ");
        System.out.println(carrosPopulares);

        //Remover
        System.out.println("Remova os modelos com consumo igua a 15,6 Km/L: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while(iterator1.hasNext()){
            if(iterator1.next().equals(15.6)) iterator1.remove();
             
        }
        System.out.println(carrosPopulares);

        System.out.println(" ");
        System.out.println("Exiba todos os carros da forma que foram informados: " );
        Map<String, Double> carrosPopoulares1 = new LinkedHashMap<>(){{
            put("gol",14.4);
            put("uno",15.6);
            put("mobi",16.1);
            put("hb20",14.5);
            put("kwid",16.5);
        }};
        System.out.println(carrosPopoulares1);

        //Exibindo de forma ordenada por modelo usa-se o treeMap
        System.out.println(" ");
        System.out.println("Exiba o dicionario ordenado pelo modelo: " );
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopoulares1);
        System.out.println(carrosPopulares2);

        //Apagar todo o dicionario.
        System.out.println(" ");
        System.out.println("Epague o dicionario de carros: " );
        carrosPopulares.clear();

        System.out.println(" ");
        System.out.println("Verificar se o dicionario de carros está vazio: " + carrosPopulares.isEmpty());








    }
}
