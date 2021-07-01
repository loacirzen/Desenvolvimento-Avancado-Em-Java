package ModuleTwo;

import java.util.function.Function;

public class Funcoes {

    public static void main(String[] args) {
        Function<String,String> RetornarNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
        Function<String,Integer> converterStringParaInteiro = string -> Integer.valueOf(string) * 2;
        System.out.println(RetornarNomeAoContrario.apply("Teste"));
        System.out.println(converterStringParaInteiro.apply("20"));



        //Function<String,Integer> converterStringParaInteiro = Integer::valueOf * 2; <- ERRADO
        //ERRADO POIS EXISTE UM PROCESSAMENTO ONDE DEVERIA TER APENAS UMA PASSAGEM DE PARAMETRO


    }

}
