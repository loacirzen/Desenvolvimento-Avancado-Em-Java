package ModuleTwo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {

    public static void main(String[] args) {
        String[] nomes = {"Teste1" , "Teste2" , "Teste3" , "Teste4", "Teste5" };
        Integer[] numeros = {1,2,3,4,5};
        imprimirNomesFiltrados(nomes);

        List<String> listaProfissoes = new ArrayList<>();
        listaProfissoes.add("Desenvolvedor");
        listaProfissoes.add("Testador");
        listaProfissoes.add("Gerente de Projeto");
        listaProfissoes.add("Gerente de Qualidade");

        listaProfissoes.stream()
                .filter(listaProfissoe -> listaProfissoe.startsWith("Gerente"))
                .forEach(System.out::println);
    }

    public static void imprimirNomesFiltrados(String... nomes){
        String nomesParaImprimir = "";
        for(int i = 0; i<nomes.length; i++){
            if(nomes[i].equals("Teste2")){
                nomesParaImprimir += " " + nomes[i];
            }
        }

        System.out.println(nomesParaImprimir);

        String nomesParaImprimerDaStream = Stream.of(nomes)
                .filter(nome -> nome.equals("Teste2"))
                .collect(Collectors.joining());

        System.out.println(" Stream -> " + nomesParaImprimerDaStream);


    }


    public static void imprimirTodosNomes(String... nomes){
        for (String nome : nomes ){
            System.out.println(nome);
        }

        Stream.of(nomes)
                .forEach(nome -> System.out.println(nome));
    }

    public static void imprirmirODobroDeCadaItemDaLista(Integer... numeros){
        for(Integer numero : numeros){
            System.out.println(numero + 2);
        }

        Stream.of(numeros).map( numero -> numero * 2)
                .forEach(System.out::println);
    }
}
