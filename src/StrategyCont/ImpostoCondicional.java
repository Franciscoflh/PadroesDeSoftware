package StrategyCont;

public class ImpostoCondicional {
    public double ImpostoMenorQueMil(double valor){
            return valor * 0.05;
    }

    public double ImpostoEntreMilETresMil(double valor){
            return valor * 0.07;
    }

    public double ImpostoAcimaDeTresMil(double valor){
            return (valor * 0.08) + 30.00;
    }
}
