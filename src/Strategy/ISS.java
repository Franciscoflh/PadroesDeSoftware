package Strategy;

public abstract class ISS implements Imposto{

    @Override
    public double calculaImposto(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }
}
