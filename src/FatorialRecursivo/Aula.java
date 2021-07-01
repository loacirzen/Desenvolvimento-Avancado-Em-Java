package FatorialRecursivo;

import java.util.function.UnaryOperator;

public class Aula {
    public static void main(String[] args){
        UnaryOperator<Integer> calcularValorVezesTrinta = valor -> valor * 3; // Paradigma Funcional
        System.out.print("O resultado é :: " + calcularValorVezesTrinta.apply(10));
        System.out.println();


        Function1 function1 = valor -> {
            System.out.println(valor);
            System.out.println(valor);
            return valor;
        };
        function1.gerar("Loacir");

    }
}


interface Function1 {
    String gerar(String valor);
}