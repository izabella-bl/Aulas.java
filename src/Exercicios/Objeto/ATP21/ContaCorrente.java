package Exercicios.Objeto.ATP21;

public class ContaCorrente extends Conta{
    private  double taxatransferencia = 10.50;
    private  double taxaManutencao = 2.50;
    private  int numTransferencia = 0;

    @Override
    public  void transferencia( double valorTransferencia){
        if(this.saldoSuficente(valorTransferencia)){
            numTransferencia ++;
            super.transferencia(valorTransferencia);

            if(numTransferencia % 5 == 0){
                double novoSaldo = this.getSaldo() - taxatransferencia - taxaManutencao;
                this.setSaldo(novoSaldo);
            }
            else{
                double novoSaldo = this.getSaldo()- taxatransferencia ;
                this.setSaldo(novoSaldo);
            }
        }

    }


}
