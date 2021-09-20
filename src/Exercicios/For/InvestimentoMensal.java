package Exercicios.For;



public class InvestimentoMensal {
    public static void main(String[] args) {

        float total = 0 ;
        float valor = 5000 ;
        float juros = (float) 1.02;

        for (int i = 1; i <= 24; i++) {

            total = valor * juros;
            System.out.printf("Valor do mês % d : R$ %.2f\n",i,total);
            valor = total;


        }
    }
}
