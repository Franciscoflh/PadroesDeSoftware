package ChainOfResponsability;

public abstract class FormatoJSON implements SelecionaFormato{

    private SelecionaFormato proximo;

    @Override
    public String retornaFormato(Formato formato){
        if(formato.equals(Formato.JSON)){
            return "{ numero: 1234, saldo:2300}";
        }else{
            return proximo.retornaFormato(formato);
        }
    }


    @Override
    public void setProximo(SelecionaFormato proximo) {
        this.proximo = proximo;

    }
}
