package Exercicios.Objeto.ATP18;

import java.math.BigDecimal;

public class ContaCorrente {
    private int agencia;
    private int numero;
    private  long cogidoCliente;
    private BigDecimal saldo;

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public long getCogidoCliente() {
        return cogidoCliente;
    }

    public void setCogidoCliente(long cogidoCliente) {
        this.cogidoCliente = cogidoCliente;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
}
