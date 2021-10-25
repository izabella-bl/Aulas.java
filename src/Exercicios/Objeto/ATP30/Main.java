package Exercicios.Objeto.ATP30;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        Scanner sc = new Scanner(System.in);
        int num1 ;
        int num2 = 0;
        int antigoNumero2 = 0;
        int novoNumero2 = 0 ;
        boolean valido = true;

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

            }catch (Exception e){
                System.out.println("Somente Números inteiros!");
                valido = false;
            }
        }while (!valido);



        try{
            double resultado1  = cal.divisao(antigoNumero2);
            System.out.println(cal.toString());
            System.out.printf("Divisao: %.2f\n",resultado1);
        }catch (Exception e){
            do {
                try{
                    System.out.println("Não pode ser divido por zero!");
                    System.out.println("Digite o 2° número novamente:");
                    num2 = Integer.parseInt(sc.nextLine());
                    novoNumero2 = num2;
                }catch (Exception ex){
                    System.out.println("Somente número inteiros!");
                }

            }while (num2 == 0  );

            double resultado2 = cal.divisao(novoNumero2);
            System.out.print(cal.toString());
            System.out.printf("DIVISÃO: %.2f\n",resultado2);

        }

    }
}
