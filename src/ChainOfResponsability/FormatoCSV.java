package ChainOfResponsability;

public abstract class FormatoCSV implements SelecionaFormato{

    private SelecionaFormato proximo;

    @Override
    public String retornaFormato(Formato formato){
        if(formato.equals(Formato.CSV)){
            return "1234%2300";
        }else{
            return proximo.retornaFormato(formato);
        }
    }

    @Override
    public void setProximo(SelecionaFormato proximo) {

        this.proximo = proximo;
    }
}
