package Exercicios.Objeto.ATP21;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        boolean validar = true;
        int cont = 1;

        Conta c = new Conta();
        c.setSaldo(5000);
        c.setCodCliente(2635);
        c.transferencia(500);
        System.out.printf("\nO Saldo final: R$ %.2f",c.getSaldo());

        ContaCorrente cc = new ContaCorrente();
        cc.setSaldo(5000);
        cc.setCodCliente(4636);

        System.out.println("\n======================Conta Corrente=====================\n");
        do{
            Scanner sc = new Scanner(System.in);
            System.out.printf("\n==================== Transferencia %d==============\n",cont);
            System.out.println("Deseja  transferir? S - sim || N - não");
            char opcao = sc.nextLine().toUpperCase().charAt(0);

            if(opcao == 'S'){
                cc.transferencia(500);
                System.out.printf("\nO Saldo final : R$ %.2f",cc.getSaldo());
                cont++;
                validar = true;

            }
            else{
                validar = false;
            }

        }while (validar);
    }
}
