package Exercicios.Metodos;

import java.util.Scanner;

public class MetodosComNumeros {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double num2;
        boolean isValido = true;

        System.out.println("---------------------Bem vindo!-----------------");
        double num1 = EntradaDeValores("Digite o primeiro numero:");

        do{
            num2 = EntradaDeValores("Digite o segundo numero:");
            isValido = Validar(num2);
        }while (!isValido);


        System.out.println(" Resultado em soma : "+ Soma(num1,num2));
        System.out.println(" Resultado em  subtração : "+ Subtracao(num1,num2));
        System.out.println(" Resultado em Multiplição : "+ Multiplicacao(num1,num2));
        System.out.println(" Resultado em divisao: "+ Divisao(num1,num2));


    }

    static double EntradaDeValores(String mensagem){
        System.out.println(mensagem);
        double num = Double.parseDouble(sc.nextLine());
        return num;

    }

    static double Soma(double numero1,double numero2){
        double resultado = numero1 + numero2;
        return resultado;

    }

    static double Subtracao(double numero1, double numero2){
        double resultado = numero1 - numero2;
        return resultado;
    }

    static double Multiplicacao(double numero1 , double numero2){
        double resultado =  numero1 * numero2;
        return  resultado;
    }

    static  double Divisao(double numero1 ,  double numero2){

        double resultado = numero1 / numero2;
        return resultado;
    }

    static boolean Validar(double num){
        if(num == 0){
            System.out.println("Erro,numero nao pode ser zero!");
            return false;
        }
        return true;
    }
}
