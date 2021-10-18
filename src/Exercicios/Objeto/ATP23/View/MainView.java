package Exercicios.Objeto.ATP23.View;

import Exercicios.Objeto.ATP23.Controller.LivroController;
import Exercicios.Objeto.ATP23.Model.Livro;

import java.util.Scanner;

public class MainView {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int op;
        LivroController livro = new LivroController();

        do {
            menu();
            System.out.print("Informe a sua opção:");
            op = Integer.parseInt(sc.nextLine());
            escolha(op, livro);
        }
        while (op != 5);

    }

    static void menu(){
        System.out.println("--------------Bem vindo!--------------");
        System.out.println("Menu\n" +
                "1 - Cadastrar Livro\n" +
                "2 - Lista de livro\n" +
                "3 - Atulizar Livro\n" +
                "4 - Remover Livro \n"+
                "5 - Sair");
    }

    static void escolha(int op, LivroController livro){
        Livro l = new Livro();


        int cont = 1 ;
        boolean validar = true;

            switch (op) {
                case 1:

                    do {
                        System.out.printf("\n===============Livro n° %d===========\n",cont);
                        System.out.println("Informe o titulo do Livro:");
                        String titulo = sc.nextLine();

                        System.out.println("Informe a descrição:");
                        String descricao = sc.nextLine();

                        System.out.println("Informe o gênero: ");
                        String genero = sc.nextLine();

                        System.out.println("Informe o ano de lançamento do livro: ");
                        int ano = Integer.parseInt(sc.nextLine());

                        l.setTitulo(titulo);
                        l.setDescricao(descricao);
                        l.setGenero(genero);
                        l.setAnoDeLancamento(ano);
                        livro.create(l);


                        validar = continuar();

                        cont++;
                        l = new Livro();

                    } while (validar);

                    break;

                case 2:
                    for (Livro liv : livro.read()) {
                        System.out.println(liv);
                    }
                    break;

                case 3:


                    break;

                case 4:

                    break;

                case 5:
                    System.out.println("Obrigado! Volte sempre.");
                    break;

                default:
                    System.out.println("Numero invalido, tente novamente!");
                    break;
            }
    }

    static boolean continuar(){
        boolean validar = true;
        char letra;
        do{
            System.out.println("Deseja cadastar outro Livro ? S - sim || N - não");
            letra = sc.nextLine().toUpperCase().charAt(0);
            System.out.println(((letra != 'S' && letra != 'N') ?"Opção invalida tente novamente!": ""));
        }while (letra != 'S' && letra != 'N');

        validar = ((letra == 'S') ? true : false);
        return validar;
    }



}
