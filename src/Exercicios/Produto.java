package Exercicios;


import java.util.Scanner;

public class Produto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------Cadastro de Produto-------------");
        System.out.println("Bem Vindo! Digite os dados dos produtos :");

        System.out.println("Digite o nome do produto: ");
        String nome = sc.next();

        System.out.println("Digite a descrição: ");
        String descricao = sc.next();

        System.out.println("Digite a categoria do produto: ");
        String categoria = sc.next();

        System.out.print("Digite o valor do produto:R$ ");
        double valor = sc.nextDouble();

        System.out.printf("\nProduto gravado com sucesso \n Nome: %s \n Descricao: %s \n Categoria: %s \n Valor: R$ %.2f \n",nome,descricao,categoria,valor);
    }
}
