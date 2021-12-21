package StrategyCont;

public class TesteImpostoCondicional {
    public static void main(String[] args) {
        ImpostoCondicional impostoCondicional = new ImpostoCondicional();
        double valor = 2000;

        if(valor < 1000){
            System.out.println(impostoCondicional.ImpostoMenorQueMil(valor));
        }
        else if(valor>=1000 || valor<=3000){
            System.out.println(impostoCondicional.ImpostoEntreMilETresMil(valor));
        }
        else{
            System.out.println(impostoCondicional.ImpostoAcimaDeTresMil(valor));
        }
    }
}
