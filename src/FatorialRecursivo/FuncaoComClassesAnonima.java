package FatorialRecursivo;

public class FuncaoComClassesAnonima {

    public static void main(String[] args) {
        Funcao colocarPrefixoSenhorNaString = new Funcao (){
            @Override
            public String gerar(String valor) { return "Sr. "+valor;}
        };

        System.out.println(colocarPrefixoSenhorNaString.gerar("João"));
    }

}
