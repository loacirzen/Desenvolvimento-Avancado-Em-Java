package ModuleTwo;

public class FuncaoAltaOrdem {

    public static void main(String[] args) {
        Calculo soma = (a,b) -> a+b;
        Calculo subtracao = (a,b) -> a-b;
        Calculo divisao = (a,b) -> a/b;
        Calculo mult = (a,b) -> a*b;

        System.out.println("Soma :" + executarOperacao(soma,1,3));
        System.out.println("Subtração :" + executarOperacao(subtracao,1,3));
        System.out.println("Divisão :" + executarOperacao(divisao,1,3));
        System.out.println("Multiplicação :" + executarOperacao(mult,1,3));


    }

    public static int executarOperacao(Calculo calculo, int a, int b){
        return calculo.calcular(a,b);
    }

}

@FunctionalInterface
interface Calculo {
    public int calcular(int a, int b);
}
