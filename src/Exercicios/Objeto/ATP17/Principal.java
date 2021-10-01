package Exercicios.Objeto.ATP17;

import java.util.Scanner;

public class Principal {
    static Scanner sc = new Scanner(System.in);
    static CalculoDeImposto c = new CalculoDeImposto();

    public static void main(String[] args) {
        boolean continuar= true;
        System.out.println("==============================Bem vindo!==========================");
        do {
            menu();
            int op = opcao();
            escolha(op);
            continuar = desejarContinuar();
        }while (continuar);

    }

     static void menu(){
        System.out.println("Menu:\n1 - ISS\n2 - IOF\n3 - IR\n");
    }

    static int opcao(){
        int op = 0;
        boolean validar;
        do {
            System.out.println("Informe uma opção:");
            op = Integer.parseInt(sc.nextLine());
            validar = ValidaNum(op);

        }while (!validar );
        return op;
    }



   static void  escolha(int op){
        switch (op){
            case 1:
                 double valor1= informaValor();
                 double calculo = calculoISS(valor1);
                 System.out.printf("\nTaxa cobrada é de: R$ %.2f\n",calculo);
                break;

            case 2:
                double valor2= informaValor();
                double calculo2 = calculoIOF(valor2);
                System.out.printf("\nTaxa cobrada é de: R$ %.2f\n",calculo2);
                break;

            case 3:
                double valor3= informaValor();
                double calculo3 = calculoIOF(valor3);
                System.out.printf("\nTaxa cobrada é de: R$ %.2f\n",calculo3);
                break;
            default:
                System.out.println("Opcao invalida!Tente novamente.");
                break;

        }
    }

    static double informaValor(){
        double valor;
        boolean validar = true;
        do {
            System.out.print("\nInforme um valor: R$ ");
            valor = Double.parseDouble(sc.nextLine());
            validar = ValidaNum(valor);
        }while (!validar);
        return valor;
    }

    static double calculoISS(double valor){
        double calculo = c.CalculoTaxaISS(valor);
        return  calculo;
    }

    static double calculoIOF(double valor){
        double calculo = c.CalculoTaxaIOF(valor);
        return  calculo;
    }

    static double calculoIR(double valor){
        double calculo = c.CalculoTaxaIr(valor);
        return  calculo;
    }

    static boolean ValidaNum(double num){
        if(num <= 0){
            System.out.println("Numero invalido! Tente novamente.");
            return  false;
        }
        else {
            return  true;
        }
    }

    static  boolean desejarContinuar( ){
        boolean retorno = true;
        char escolha = ' ';
        do {
            System.out.println("Deseja continuar ? S - sim | N - Não");
            escolha = sc.nextLine().toUpperCase().charAt(0);
            if (escolha == 'S') {
                retorno =true;
            } else if (escolha == 'N') {
                System.out.println("Obrigada!");
                retorno = false;
            }
            else {
                System.out.println("Opção Invalida!Tente novamente.");
            }
        }while (escolha != 'S'&& escolha != 'N');
        return retorno;
    }

}

