package Modulo1.Aula4;

import java.util.Scanner;

public class A4_2_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome produto");
        String nome = sc.nextLine();
        boolean invalido = true;

        while(invalido){
            if ( nome.length() < 5){
                System.out.println("O nome tem que ter mais de 5 letras!");

                System.out.println("Digite o nome produto");
                nome = sc.nextLine();
            }
            else{
                invalido=false;
            }

        }
    }
}
