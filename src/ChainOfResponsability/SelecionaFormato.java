package ChainOfResponsability;

public interface SelecionaFormato {
    String retornaFormato(Formato formato);

    void setProximo(Formato proximo);

    void setProximo(SelecionaFormato proximo);
}
