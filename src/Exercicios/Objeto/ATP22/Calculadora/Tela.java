package Exercicios.Objeto.ATP22.Calculadora;

public class Tela {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
           int soma1 = cal.soma(10,10);
           double soma2 = cal.soma(4.6,7.8);
           float soma3 = (float) cal.soma(32.5,68.4);
           long soma4 = (int) cal.soma(422,532,232);

        System.out.printf("Soma 1: %d\n" +
                        "Soma 2: %.2f\n" +
                        "Soma 3: %.2f\n" +
                        "Soma 4: %d",soma1,soma2,soma3,soma4);

    }
}
