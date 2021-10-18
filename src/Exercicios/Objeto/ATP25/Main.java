package Exercicios.Objeto.ATP25;

public class Main {
    public static void main(String[] args) {
        Computador c = new Computador();
        Notebook n = new Notebook();
        Desktop d = new Desktop();

        c.marca = "Lenovo";
        c.memoria = "1 T";
        c.processador = "intel i7";


        n.versaoBluethooth = "849.038.3";
        n.bateria = "2747v";
        n.velocidadeWife = "100 mb";

        d.fonte = " 220v";
        d.tamGabinete = "50X30x40";
        d.tamMonitor = "19\"";

        Object obj1 = c;
        Object obj2 = n;
        Object obj3 = d;

        Computador c2 = (Computador) obj1;
        Notebook n2 = (Notebook) obj2;
        Desktop d2 = (Desktop) obj3;

        System.out.println(c2);
        System.out.println(n2);
        System.out.println(d2);
    }
}
