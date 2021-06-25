package ExerciciosPropostos;

import java.util.*;

public class ExercicioPropostoArcoIris {

    public static void main(String[] args) {

        /*Cria um conjunto com as cores do Arco-Iris e exibir na tela de forma
        ordenada, quantidade de cores, exibir ordem inversa da cores, ordem alfabeticas, remover as cores que
        começam com a letra V, remover todas as cores e confirmar se o conjunto está vazio.
        as cores: violeta, anil, azul, verde, amarelo, laranja, vermelho"*/

        // 1)Criando o Conjunto de cores e adicionando as cores.
        System.out.println("Criar um conjunto com as cores do arco-iris:");
        Set<String> coresArcoIris = new HashSet<>();

        coresArcoIris.add("Violeta");
        coresArcoIris.add("Anil");
        coresArcoIris.add("Azul");
        coresArcoIris.add("Verde");
        coresArcoIris.add("Amarelo");
        coresArcoIris.add("Laranja");
        coresArcoIris.add("Vermelho");


        System.out.println(coresArcoIris);
        System.out.println("");

        // 2) Exibindo uma abaixo da outra.
        System.out.println("Exibir as cores uma abaixo da outra:");
        for(String cor : coresArcoIris){
            System.out.println(" * " + cor);
        }

        System.out.println("");
        // 3) Quantas cores o arco-iris tem ou seja Quantidade cores cadastradas.
        System.out.println("Quantidades de cores tem no arco-iris: " + coresArcoIris.size());
        System.out.println("");

        // 4) Exibir em ordem alfabetica:
        System.out.println("Exibir as cores em ordem alfabetica: ");
        Set<String> coresArcoIris1 = new TreeSet<>(coresArcoIris);
        for(String cor : coresArcoIris1) {
            System.out.println(" * " + cor);
        }
        System.out.println("");

        // 5) Exibir na ordem Inversa:
        System.out.println("Exibir as cores na ordem inversa que foi informa: ");
        Set<String> coresArcoIris2 = new LinkedHashSet<>(
                Arrays.asList("violeta, anil, azul, verde, amarelo, laranja, vermelho"));
        System.out.println(" * " + coresArcoIris2 );
        List<String> coresArcoIrisList = new ArrayList<>(coresArcoIris);
        Collections.reverse(coresArcoIrisList);
        for(String cor : coresArcoIrisList) {
            System.out.println(" * " + cor);
        }
        System.out.println("");

        // 6) Exibir as cores que começam com a letra " V " :
        System.out.println(" Exibir todas as cores que começam com a letra ' V ' : ");
        for( String cor : coresArcoIris){
            if(cor.startsWith("V")) System.out.println(" * " + cor);
        }
        System.out.println("");

        // 7) Remover as cores que iniciam com a letra " V " :
        System.out.println("Remover as cores que começam com a letra '' V '' e deixar somente as que não começam com '' V '': ");
        Iterator<String> iterator1 = coresArcoIris.iterator();
        while (iterator1.hasNext()){
            if (iterator1.next().startsWith("V")) iterator1.remove();
        }
        for (String cor : coresArcoIris) {
            System.out.println(" * " + cor);
        }

        System.out.println("");

        // 8) Limpar o conjunto:
        System.out.println("Limpar o Conjunto: ");
        coresArcoIris.clear();


        System.out.println("");

        // 9) verificar se está Vazio:
        System.out.println("Conferindo se o conjunto está Limpo: " + coresArcoIris.isEmpty());


    }
}
