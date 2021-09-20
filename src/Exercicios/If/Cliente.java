package Exercicios.If;

import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);

        System.out.println("-------------Cadastro de Cliente-------------");
        System.out.println("Bem vindo , Digite as informações do cliente:");
        System.out.print("Digite o nome  completo do cliente: ");
        String nome = var.nextLine();
        System.out.print("Digite a idade do cliente: ");
        short idade = var.nextShort();

        if(idade >= 18){
            System.out.println("Cliente gravado com sucesso!\n"+"Nome: "+nome+"\n"+"Idade: "+idade);
        }
        else{
            System.out.println("Cliente tem que ser maior de idade!");
        }



    }
}
