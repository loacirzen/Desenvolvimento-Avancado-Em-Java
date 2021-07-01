package ModuleTwo;

import java.util.function.Predicate;

public class Predicados {

    public static void main(String[] args) {

        Predicate<String> estaVazio = valor-> valor.isEmpty();
        Predicate<String> estaVazio2 = String::isEmpty; // CORRETO POIS NÃO TEMOS PROCESSAMENTO (TRATAMENTO)
        Predicate<String> estaVazio3 = valor -> {
            return valor.isEmpty();
        };

        System.out.println(estaVazio.test(""));
        System.out.println(estaVazio.test("Loacir"));

    }

}
