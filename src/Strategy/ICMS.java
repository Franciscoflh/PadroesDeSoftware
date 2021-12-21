package Strategy;

public abstract class ICMS implements Imposto{

    @Override
    public double calculaImposto(Orcamento orcamento) {
        return orcamento.getValor()*0.25;
    }

}
