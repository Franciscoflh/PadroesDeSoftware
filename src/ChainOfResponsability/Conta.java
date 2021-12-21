package ChainOfResponsability;

public class Conta {
    private double saldo;
    private String nome;

    public String retornaFormato(Formato formato){
        SelecionaFormato json = new FormatoJSON() {
            @Override
            public void setProximo(Formato proximo) {

            }
        };
        SelecionaFormato csv = new FormatoCSV() {
            @Override
            public void setProximo(Formato proximo) {

            }
        };
        SelecionaFormato xml = new FormatoXML() {
            @Override
            public void setProximo(Formato proximo) {

            }
        };

        return json.retornaFormato(formato);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
