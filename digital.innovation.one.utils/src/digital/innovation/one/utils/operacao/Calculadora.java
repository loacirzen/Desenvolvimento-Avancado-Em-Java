package digital.innovation.one.utils.operacao;

import digital.innovation.one.utils.operacao.internal.DivHelper;
import digital.innovation.one.utils.operacao.internal.MultHelper;
import digital.innovation.one.utils.operacao.internal.SubHelper;
import digital.innovation.one.utils.operacao.internal.SumHelper;

public class Calculadora {

    private DivHelper divHelper;
    private MultHelper multHelper;
    private SumHelper sumHelper;
    private SubHelper subHelper;


    public Calculadora(){
        divHelper = new DivHelper();
        multHelper = new MultHelper();
        sumHelper = new SumHelper();
        subHelper = new SubHelper();
    }

    public int sum(int a, int b){
        return sumHelper.execute(a,b);
    }

    public int sub(int a, int b){
        return subHelper.execute(a,b);
    }

    public int mult(int a, int b){
        return multHelper.execute(a,b);
    }

    public int div(int a, int b){
        return divHelper.execute(a,b);
    }

}
