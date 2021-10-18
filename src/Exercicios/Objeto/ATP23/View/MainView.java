package Exercicios.Objeto.ATP23.View;

import Exercicios.Objeto.ATP23.Controller.LivroController;
import Exercicios.Objeto.ATP23.Model.Livro;


import java.util.Scanner;
import java.util.UUID;

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
        int cont = 1;
        boolean validar = true;

            switch (op) {
                case 1:

                    do {
                        validar = case1(l,livro,cont,validar);
                        l = new Livro();
                        cont ++;
                    } while (validar);

                    break;

                case 2:
                    ListaLivro(livro);

                case 3:
                     do{
                         int opcao = menuAtulizar();
                         atulizar(opcao,l,livro);
                         validar = continuar("Deseja Atulizar outro livro?");

                     }while (validar);

                    System.out.println("-----------------------Novos dados-----------------------------");
                    ListaLivro(livro);

                    break;

                case 4:
                    String Id = digiteId();
                    UUID id = UUID.fromString(Id);
                    l.setId(id);
                    livro.delete(l);
                    System.out.println("-----------------------Novos dados-----------------------------");
                    ListaLivro(livro);
                    break;

                case 5:
                    System.out.println("Obrigado! Volte sempre.");
                    break;

                default:
                    System.out.println("Numero invalido, tente novamente!");
                    break;
            }
    }

    static boolean continuar(String mensssagem ){
        boolean validar = true;
        char letra;
        do{
            System.out.printf("%s S - sim || N - não\n",mensssagem);
            letra = sc.nextLine().toUpperCase().charAt(0);
            System.out.println(((letra != 'S' && letra != 'N') ?"Opção invalida tente novamente!": ""));
        }while (letra != 'S' && letra != 'N');

        validar = ((letra == 'S') ? true : false);
        return validar;
    }

    static boolean case1(Livro l,LivroController livro,int cont, boolean validar){
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

        validar = continuar("Desejar cadastarar outro livro?");

        return validar;
    }

    static int  menuAtulizar(){
        System.out.println("O que você desejar atulizar ?");
        System.out.println("1 - Título\n" +
                           "2 - Descrição\n" +
                           "3 - Gênero\n" +
                           "4 - Ano de lançamento\n");

        System.out.print("Digite sua opção:");
        int op = Integer.parseInt(sc.nextLine());
        return op;
    }

    static  void atulizar(int op,Livro l , LivroController lc){
        switch (op){
            case 1:
                String Id = digiteId();
                UUID id = UUID.fromString(Id);
                l.setId(id);
                System.out.println("Digite o novo titulo:");
                String novoTitulo = sc.nextLine();
                l.setTitulo(novoTitulo);

                lc.update(l,op);

                break;


            case 2:
                String Id2 =digiteId();
                UUID id2 = UUID.fromString(Id2);
                l.setId(id2);
                System.out.println("Digite a nova Descrição:");
                String descricao = sc.nextLine();
                l.setDescricao(descricao);

                lc.update(l,op);

                break;

            case 3:
                String Id3 = digiteId();
                UUID id3 = UUID.fromString(Id3);
                l.setId(id3);
                System.out.println("Digite o Gênero do livro atulizado:");
                String genero = sc.nextLine();
                l.setGenero(genero);

                lc.update(l,op);

                break;

            case 4:
                String Id4 = digiteId();
                UUID id4 = UUID.fromString(Id4);
                l.setId(id4);
                System.out.println("Digite o ano Atulizado:");
                String ano = sc.nextLine();
                l.setGenero(ano);

                lc.update(l,op);

                break;

            default:
                System.out.println("Opção não existe ,tente novamente!");
                break;

        }

    }

    static String digiteId(){
        System.out.println("Digite o id do livro:");
        String Id = sc.nextLine();
        return Id;
    }

    static void ListaLivro(LivroController livro){
        for (Livro liv : livro.read()) {
            System.out.println(liv);
        }
    }


}
