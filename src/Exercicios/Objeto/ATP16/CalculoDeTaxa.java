package Exercicios.Objeto.ATP16;

public class CalculoDeTaxa {
    private double valor;
    private int vez;

    public double TaxaTransferencia( double valor) {
        double calculo =  (valor * 0.000001);
        return calculo + valor;
    }

    public   double TaxaSaque(double valor) {
         vez++;
         if(vez % 5 == 0){
             return valor - 1.30;
         }
           return valor;

    }

}









/*  int qtd = 0;
        for (int i = 1; i <= vezes; i++) {
                if(i % 5 == 0 ){
                qtd++;
                }

                valor += (1.50 * qtd); */