package Exercicios.Objeto.ATP30;

import java.util.Scanner;

public class Main {
    static Calculadora cal = new Calculadora();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int op = 0 ;
        int num1;
        int num2 = 0;
        boolean valido = true;
        int antigoNumero2 = 0 ;
        do{
            System.out.println("\n=============================Menu=========================\n");
            do{
                try {
                    System.out.println("Digite o 1° número:");
                    num1 = Integer.parseInt(sc.nextLine());
                    cal.setNumero1(num1);
                    valido = true;

                    System.out.println("Digite o 2° número:");
                    num2 = Integer.parseInt(sc.nextLine());
                    cal.setNumero2(num2);
                    antigoNumero2 = num2;

                } catch (Exception e) {
                    System.out.println("Somente Números inteiros!");
                    valido = false;
                }

            } while (!valido );
            op = menu();
            cases(op,num2,antigoNumero2);
        }while (op != 5);

     }

     static int menu(){
        int op = 0;
        try {
            System.out.println("1 - SOMA\n2 - SUBTRAÇÃO\n3 - MULTIPLICAÇÃO\n4 - Divisão\n5 - Sair\n");
            System.out.print("Digite uma opção:");
            op = Integer.parseInt(sc.nextLine());
        }catch (Exception e){
            System.out.println("Somente numeros inteiros ");
        }
         return op;
     }

     static void cases(int op,int num2 ,double antigoNumero2){
            switch (op) {
                case 1:
                    System.out.println(cal.toString(1));
                    break;
                case 2:
                    System.out.println(cal.toString(2));
                    break;
                case 3:
                    System.out.println(cal.toString(3));
                    break;

                case 4:
                    int novoNumero2 = 0;

                    if(antigoNumero2 == 0) {
                        System.out.println("Nâo é possível dividir por zero.");
                        do {
                            try {
                                System.out.println("Digite o 2° número novamente:");
                                num2 = Integer.parseInt(sc.nextLine());
                                novoNumero2 = num2;
                            } catch (Exception ex) {
                                System.out.println("Somente número inteiros!");
                            }

                        } while (num2 == 0);

                        double resultado2 = cal.divisao(novoNumero2);
                        System.out.printf("DIVISÃO: %.2f\n", resultado2);
                    }
                    else{
                        double resultado1  = cal.divisao(antigoNumero2);
                        System.out.printf("Divisao: %.2f\n",resultado1);
                    }

                    break;
                case 5:
                    System.out.println("Até mais!");
                    break;
                default:
                    System.out.println("Nâo existe essa opção!tente novamente");
                    break;

            }
     }



    }
