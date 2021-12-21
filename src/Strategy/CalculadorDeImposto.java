package Strategy;

public class CalculadorDeImposto {
    public void realizaCalculo(Orcamento orcamento, Imposto imposto){
        double valor = imposto.calculaImposto(orcamento);
        System.out.println(valor);
    }
}
