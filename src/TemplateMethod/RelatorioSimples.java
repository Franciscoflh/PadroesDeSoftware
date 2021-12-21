package TemplateMethod;

public abstract class RelatorioSimples extends Relatorio{
    void Cabecalho(){
        System.out.println("Banco Dark");
    }
    void Rodape(){
        System.out.println("Telefone: (66) 12345-6789");
    }
    void CorpoRelatorio(){
        System.out.println("Titular: Francisco");
        System.out.println("Saldo: R$2000.00");
    }
}
