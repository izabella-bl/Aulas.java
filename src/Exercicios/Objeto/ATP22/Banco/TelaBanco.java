package Exercicios.Objeto.ATP22.Banco;

import java.util.Scanner;

public class TelaBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ContaCorrente cc = new ContaCorrente(5000 , 7473);
        cc.setTaxaSaque(2.50);
        System.out.println("Seu Saldo é de: R$ "+cc.getSaldo());
        System.out.println("O que deseja fazer?\n1 - Sacar\n2 - Depositar");
        int op = Integer.parseInt(sc.nextLine());


            switch (op){

                case 1:
                    System.out.println("Informe o valor que deseja sacar :");
                    double saque =Double.parseDouble(sc.nextLine());
                    cc.saque(saque);
                    System.out.println(cc);
                    break;

                case 2:
                    System.out.println("Informe o valor que deseja depositar :");
                    double deposito =Double.parseDouble(sc.nextLine());
                    cc.deposito(deposito);
                    System.out.println(cc);
                    break;

            }

    }
}
