package Modulo1.Aula4;

import java.util.Scanner;

public class A4_1_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome produto");
        String nome = sc.nextLine();

        while(nome.length() < 5){
            if ( nome.length() < 5){
                System.out.println("O nome tem que ter mais de 5 letras!");
            }

            System.out.println("Digite o nome produto");
            nome = sc.nextLine();
        }
    }
}
