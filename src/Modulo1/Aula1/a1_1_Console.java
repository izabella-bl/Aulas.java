package Modulo1.Aula1;

import java.util.Scanner;

public class a1_1_Console {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu nome:");
        String nome = sc.next();

        System.out.println("Digite o seu sobrenome:");
        String sobreNome = sc.next();

        System.out.println("Digite o sua idade:");
        int idade = sc.nextInt();

        System.out.println("Seu nome é :"+nome +" "+ sobreNome + " \n e sua idade é:"+ idade);



    }
}
