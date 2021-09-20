package Exercicios.For;

import java.util.Scanner;

public class CadastroNome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1 ;


        System.out.println("Informe o seu nome:");
        String nome = sc.nextLine();
        System.out.println("Informe o seu sobrenome");
        String sobrenome = sc.nextLine();

        System.out.println("-------------------------------------Utilizando While-----------------------");
        while(i <= 10 ){
            System.out.printf( "%d° vez -Nome: %s %s\n",i,nome,sobrenome);
            i++;
        }

        System.out.println("-------------------------------Utilizando For-------------------------");

        for (int j = 0; j <= 10; j++) {
            System.out.printf("%d° vez -Nome: %s %s\n",j,nome,sobrenome);

        }

    }
}
