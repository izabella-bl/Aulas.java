package Modulo1.Aula3;

import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);

        System.out.println("-------------Cadastro de Cliente-------------");
        System.out.println("Bem vindo , Digite as informações do cliente:");
        System.out.print("Digite o nome do cliente: ");
        String nome = var.next();
        System.out.print("Digite a idade do cliente: ");
        short idade = var.nextShort();
        System.out.println("nome "+nome+" e idade "+idade+" foi gravado com sucesso");


    }
}
