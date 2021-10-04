package Exercicios.Objeto.ATP18.Banco;

import Exercicios.Objeto.ATP18.Banco.ContaCorrente;

public class MainBanco {
    public static void main(String[] args) {
        ContaCorrente c = new ContaCorrente();

        c.setAgencia(1234);
        c.setNumero(939482);
        c.setCogidoCliente(5838);
        c.setSaldo(150000.00);

        int agencia = c.getAgencia();
        int numero = c.getNumero();
        long codigoCliente = c.getCogidoCliente();
        double saldo = c.getSaldo();

        System.out.println("========================Cliente====================");
        System.out.printf("\nCodigo Cliente: %d\nAgencia: %d\nNumero: %d\nSaldo: R$ %.2f\n",codigoCliente,agencia,numero,saldo);
    }
}
