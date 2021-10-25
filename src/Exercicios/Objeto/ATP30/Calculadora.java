package Exercicios.Objeto.ATP30;

public class Calculadora {
    private int numero1;
    private int numero2;

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int soma() {
        return this.numero1 + this.numero2;
    }

    public int subtracao() {
        return this.numero1 - this.numero2;
    }

    public int multiplicacao() {
        return this.numero1 * this.numero2;
    }

    public double divisao(int numero2) {
        return (double) (this.numero1 / numero2);
    }


    public String toString(int op) {

        if(op == 1){
            return "Soma: "+this.soma();
        }
        else if(op == 2){
            return  "Subtração: "+this.subtracao();
        }
        else  if(op == 3){
            return  "Multiplição: "+this.multiplicacao();
        }
        else {
            return String.format("RESULTADO:\nSOMA: %d\n" +
                    "SUBTRAÇÃO :%d\n" +
                    "MULTIPLICAÇÃO: %d\n", this.soma(), this.subtracao(), this.multiplicacao());
        }
    }
}

