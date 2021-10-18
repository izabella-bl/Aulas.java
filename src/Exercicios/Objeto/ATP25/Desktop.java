package Exercicios.Objeto.ATP25;

public class Desktop extends Computador{
    public String tamGabinete;
    public String tamMonitor;
    public String fonte;

    @Override
    public String toString() {
        return "Desktop{" +
                "tamGabinete='" + tamGabinete + '\'' +
                ", tamMonitor='" + tamMonitor + '\'' +
                ", fonte='" + fonte + '\'' +
                '}';
    }
}
