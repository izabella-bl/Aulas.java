package Exercicios;

import java.util.Scanner;

public class MenuEntretedimento {
    public static void main(String[] args) {
        //JAVA 2 - Estruturas de decisão SWITCH-CASE
        //Atividade prática 3

        Scanner sc = new Scanner(System.in);

        System.out.println("----------------------Bem Vindo ao NetCine!-----------------");
        System.out.println("Cadastre aqui :\n * O seu Filme\n * A sua Série\n * O seu Documentario \n");

        System.out.println("Digite:  ");
        System.out.println("1- Para Filme ");
        System.out.println("2-Para Serie ");
        System.out.println("3-Para Documentario");
        System.out.println("0-Sair");
        System.out.print("\nDigite:");
        int opcao = sc.nextInt();
        sc.nextLine();


        switch (opcao){
            case 0:
                System.out.println("Obrigado por ter acessado o nosso site!");
                break;
            case 1:
                System.out.println("\nDigite o nome do filme:");
                String NomeDoFilme = sc.nextLine();
                System.out.println("Digite a descrição do filme");
                String DescricaoFilme = sc.nextLine();
                System.out.println("Digite o gênero do filme:");
                String GeneroFilme = sc.nextLine();
                System.out.println("Digite o ano de lançamento do filme:");
                int AnoFilme = sc.nextInt();

                System.out.printf("Filme: %s\nDescrição: %s\nGênero: %s\nAno: %d",NomeDoFilme,DescricaoFilme,GeneroFilme,AnoFilme);
                break;
            case 2:
                System.out.println("\nDigite o nome da serie:");
                String NomeDaSerie = sc.nextLine();
                System.out.println("Digite o nome da produtora:");
                String Produtora= sc.nextLine();
                System.out.println("Digite o ano de lançamento do filme:");
                int Anoserie = sc.nextInt();


                System.out.printf("Série: %s\nProdutora: %s\nAno: %d",NomeDaSerie,Produtora,Anoserie);
                break;
            case 3:
                System.out.println("\nDigite o nome do documentario:");
                String NomeDoDocum = sc.nextLine();
                System.out.println("Digite o tema do documentario:");
                String Tema = sc.nextLine();
                System.out.println("Digite o ano de lançamento do documentario:");
                int AnoDocum = sc.nextInt();

                System.out.printf("Filme: %s\nTema: %s\n Ano: %d",NomeDoDocum,Tema,AnoDocum);
                break;
            default:
                System.out.println("Opção invalida, tente novamente");
                break;
            }


        }
    }

