package Exercicios.Objeto.ATP21;




public class Conta {
    private double saldo;
    private int codCliente;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public void  transferencia(double valorDeTransferencia){
      if(this.saldoSuficente(valorDeTransferencia)){
          saldo-=valorDeTransferencia;
      }

    }

    public boolean saldoSuficente(double valor){
        if(saldo < valor){
            System.out.println("Saldo insuficinete !");
            return false;
        }
        else{
            return true;
        }
    }
}
