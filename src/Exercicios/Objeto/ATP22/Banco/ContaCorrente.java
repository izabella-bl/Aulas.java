package Exercicios.Objeto.ATP22.Banco;

public class ContaCorrente {
    private double saldo;
    private double taxaSaque;
    private int codCliente;

    // Método Construtor
    public ContaCorrente(double valorSaldo, int codCliente) {
        this.saldo = valorSaldo;
        this.codCliente = codCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTaxaSaque() {
        return taxaSaque;
    }

    public void setTaxaSaque(double taxaSaque) {
        this.taxaSaque = taxaSaque;
    }


    public void saque(double saqueValor) {
        this.saldo -= (saqueValor + this.taxaSaque);
    }

    public void deposito(double valorDeposito) {
        this.saldo += valorDeposito;
    }

    @Override
    public String toString() {
        String mensagem = "Cod.Cliente: "+this.codCliente+"\n"+
                          "Saldo: "+this.saldo+"\n"+
                          "Taxa Aplicada :"+this.taxaSaque;
        return mensagem;

    }
}
