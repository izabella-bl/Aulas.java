package Exercicios.Objeto.ATP17;

public class CalculoDeImposto {
    private double valor ;
    private  double taxaISS =  0.02;
    private  double taxaIOF = 0.011;

    public double CalculoTaxaISS(double valor){
          return valor * taxaISS;
    }

    public  double CalculoTaxaIOF(double valor){
        return  valor * taxaIOF;
    }

    public  double CalculoTaxaIr(double valor){
        if (valor <= 1903.98){
            System.out.println("Isento do Tributo.");
            return  valor;
        }
        else if(valor >=1903.99 && valor <= 2826.65){
            return valor * 0.075;
        }
        else if(valor >=2826.66 && valor <= 3751.05){
            return valor * 0.15;
        }
        else if(valor >=3751.06 && valor <= 4664.68){
            return valor * 0.225;
        }
        else {
            return valor * 0.275;
        }
    }
}
