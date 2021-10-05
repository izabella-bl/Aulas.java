package Exercicios.Objeto.ATP20;

import java.math.BigDecimal;

public class Funcionario extends Pessoa{
    private BigDecimal salario;
    private String departamento;

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
