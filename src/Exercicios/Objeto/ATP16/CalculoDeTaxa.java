package Exercicios.Objeto.ATP16;

public class CalculoDeTaxa {
    private double valor;
    private int vezes;

    public static double TaxaTransferencia( double valor) {
        double calculo =  (valor * 0.000001);
        return calculo + valor;
    }

    public  static  double TaxaSaque(int vezes ,double valor) {
        int qtd = 0;
        for (int i = 1; i <= vezes; i++) {
            if(i % 5 == 0 ){
                qtd++;
            }
        }
           valor += (1.50 * qtd);
           return valor;

    }

}
