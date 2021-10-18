package Exercicios.Objeto.ATP25;

public class Notebook extends Computador {
    public  String bateria;
    public  String velocidadeWife;
    public  String versaoBluethooth;

    @Override
    public String toString() {
        return "Notebook{" +
                "bateria='" + bateria + '\'' +
                ", velocidadeWife='" + velocidadeWife + '\'' +
                ", versaoBluethooth='" + versaoBluethooth + '\'' +
                '}';
    }
}
