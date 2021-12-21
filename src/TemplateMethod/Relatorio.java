package TemplateMethod;

public abstract class Relatorio {

    public final void relatorio(){
        cabecalho();
        corpoRelatorio();
        rodape();
    }

    abstract void cabecalho();
    abstract void rodape();
    abstract void corpoRelatorio();
}


