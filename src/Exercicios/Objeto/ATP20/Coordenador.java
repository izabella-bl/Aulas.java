package Exercicios.Objeto.ATP20;

public class Coordenador extends  Funcionario{
    private  String cursoCoordenado;
    private  long bonus;

    public String getCurso() {
        return cursoCoordenado;
    }

    public void setCurso(String curso) {
        this.cursoCoordenado = curso;
    }

    public long getBonus() {
        return bonus;
    }

    public void setBonus(long bonus) {
        this.bonus = bonus;
    }
}
