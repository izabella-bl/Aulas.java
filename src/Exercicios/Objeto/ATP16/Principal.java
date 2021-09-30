package Exercicios.Objeto.ATP16;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cont = 1;
        boolean validar = true;
        CalculoDeTaxa c = new CalculoDeTaxa();
        System.out.println("------------------Saque de transferencia------------------");
        System.out.println("Informe um valor a transferir:");
        double valor =Double.parseDouble(sc.nextLine());
        double resultado = c.TaxaTransferencia(valor);
        System.out.printf("\nValor de transferencia: R$ %.2f\n",resultado);


        System.out.println("----------------------Saque-------------------");
        do {
                System.out.println("Deseja sacar? S - sim | N - não");
                String reposta = sc.nextLine().toUpperCase();

            if (reposta.equals("S")) {
                System.out.printf("\n-----------------Saque %d-------------\n",cont);
                System.out.println("Digite o valor :");
                double valor1 = Double.parseDouble(sc.nextLine());
                double ValorTotal = c.TaxaSaque(valor1);
                System.out.printf("Valor total é : R$ %.2f\n",ValorTotal);
                cont ++;
                validar = true;

            }
            else {
                validar = false;
            }

        } while (validar);


    }
}
