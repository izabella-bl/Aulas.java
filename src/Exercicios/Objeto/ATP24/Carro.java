package Exercicios.Objeto.ATP24;

public class Carro {
    public int numDePorta;
    public double capacidadePortaMala;

    @Override
    public String toString() {
        return "Carro"+"\n" +
                "Numero de portas: "+this.numDePorta+"\n"+
                "Capcidade do Porta Mala: "+this.capacidadePortaMala+"\n";
    }
}
