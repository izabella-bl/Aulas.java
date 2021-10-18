package Exercicios.Objeto.ATP24;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo();
        veiculo.marca = "Ford";
        veiculo.modelo = "Ka";
        veiculo.placa = "QXS-7272";

        Carro carro = new Carro();
        carro.capacidadePortaMala = 275;
        carro.numDePorta = 4;

        Object obj1 = veiculo;
        Object obj2 = carro;

        Veiculo v1 = (Veiculo) obj1;
        Carro c1 = (Carro) obj2;

        System.out.println(v1);
        System.out.println(c1);
    }

}
