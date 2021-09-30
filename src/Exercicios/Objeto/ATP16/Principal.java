package Exercicios.Objeto.ATP16;

public class Principal {
    public static void main(String[] args) {
        CalculoDeTaxa c = new CalculoDeTaxa();
        double valor = c.TaxaTransferencia(5000.00);
        double valor2 = c.TaxaSaque(18,5000);

        System.out.printf("Valor final da transferencia: R$ %.2f\n Valor final do saque : R$ %.2f",valor, valor2);
    }
}
