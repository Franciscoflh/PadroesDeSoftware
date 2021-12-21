# Atividade de Padrões de Software

1 - Crie todo o mecanismo para flexibilizar a criação de diferentes estratégias de impostos. Crie a
interface Imposto, e as estratégias ICMS e ISS. O ISS deve ser 6% do valor do orçamento, e o
ICMS deve ser 25% do valor do orçamento. Crie a classe Orcamento, que tem como atributo
um valor. Crie um construtor que recebe esse valor, e um getter para devolvê-lo. Crie a classe
CalculadorDeImposto, que recebe um Orcamento e um Imposto. Essa classe calcula o imposto
usando a estratégia recebida e imprime o resultado na tela.

2 - Implemente mais uma estratégia de cálculo de imposto. Crie o imposto que se chama
ImpostoCondicional, que retorna 5% do valor total caso o orçamento seja menor do que R$
1000,00 reais, 7% caso o valor esteja entre R$ 1000 e R$ 3000,00 com os limites inclusos, ou
8% mais 30 reais, caso o valor esteja acima de R$ 3000,00. Escreva um método main que
testa sua implementação.

3 - Relatórios são muito parecidos: todos eles contêm cabeçalho, corpo, e rodapé. Existem dois
tipos de relatórios: simples e complexos. As diferenças são sutis: relatórios simples possuem
cabeçalhos e rodapés de uma linha, apenas com o nome do banco e telefone,
respectivamente; relatórios complexos possuem cabeçalhos que informam o nome do banco,
endereço, telefone, e rodapés que informam e-mail, e a data atual. Além disso, dada uma lista
de contas, um relatório simples apenas imprime titular e saldo da conta. O relatório complexo
exibe titular, agência, número da conta, e saldo. Use Template Method, e implemente o
mecanismo de relatórios. Use dados falsos para os dados do banco.

4 - Um servidor de aplicação bancária que se comunica com outros deve responder de várias
formas diferentes, de acordo com a solicitação da aplicação cliente.
Se a aplicação solicitar uma Conta, cujos atributos formatados em JSON, por exemplo, o
servidor deverá responder nesse formato; se a aplicação solicitar XML, o servidor deverá
responder XML; se ela pedir no formato CSV, separado por % (por cento), a aplicação deverá
devolver dessa forma. Implemente um Chain of Responsibility onde, dada uma requisição e uma conta
bancária, ela passeia por toda a corrente até encontrar a classe que deve processar a
requisição de acordo com o formato solicitado, e imprime na tela a conta bancária no formato correto.
Imagine que a classe Requisição possui um getter getFormato(), que responde "XML",
"CSV", ou "PORCENTO", indicando qual tratamento adequado. Uma Conta possui apenas
saldo e nome do titular:

enum Formato {
JSON,
XML,
CSV
}

class Requisicao {
private Formato formato;
public Requisicao(Formato formato) {
this.formato = formato;
}
// getter para o Formato
}
{ numero: 1234, saldo:2300 }
<conta > <numero>1234</numero> <saldo> 2300</saldo></conta>
1234%2300
