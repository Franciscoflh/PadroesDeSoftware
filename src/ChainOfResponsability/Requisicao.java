package ChainOfResponsability;

enum Formato{
    JSON,
    XML,
    CSV;
}

public class Requisicao {
    private Formato formato;

    public Requisicao(Formato formato){
        this.formato = formato;
    }

    public Formato getFormato() {
        return formato;
    }
}
