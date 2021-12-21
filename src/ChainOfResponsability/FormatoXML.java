package ChainOfResponsability;

public abstract class FormatoXML implements SelecionaFormato{

    private SelecionaFormato proximo;

    @Override
    public String retornaFormato(Formato formato){
        if(formato.equals(Formato.XML)){
            return "<conta > <numero>1234</numero> <saldo> 2300</saldo></conta>";
        }else{
            return proximo.retornaFormato(formato);
        }
    }

    @Override
    public void setProximo(SelecionaFormato proximo) {

        this.proximo = proximo;
    }
}
