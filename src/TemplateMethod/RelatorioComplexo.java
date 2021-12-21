package TemplateMethod;

public abstract class RelatorioComplexo extends Relatorio{
    void Cabecalho(){
        System.out.println("Banco Dark");
        System.out.println("Endereço: Rua 43, Quadra 23, Bairro Undefined");
        System.out.println("Telefone: (66) 12345-6789");
    }
    void Rodape(){
        System.out.println("aaabbb@gmail.com");
        System.out.println("21/07/2019");
    }
    void CorpoRelatorio(){
        System.out.println("Titular: Francisco");
        System.out.println("Agência: 3452-1");
        System.out.println("Número da Conta: 23412-5");
        System.out.println("Saldo: R$2000.00");
    }

}
