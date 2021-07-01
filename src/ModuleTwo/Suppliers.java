package ModuleTwo;

import java.util.function.Supplier;

public class Suppliers {

    public static void main(String[] args) {
        Supplier<Pessoa> suppliers = () -> new Pessoa();
        //Supplier<Pessoa> suppliers = Pessoa::new; METODO DE REFÊNCIA

        System.out.println(suppliers.get());

    }
}

class Pessoa{
        private String nome;
        private Integer idade;

        public Pessoa(){
            nome = "Loacir";
            idade = 30;
        }


        @Override
        public String toString() {
            return String.format("nome : %s, idade : %d", nome,idade);
        }
}
