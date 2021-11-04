package Exercicios.MVC.ATP31.View;

import Exercicios.MVC.ATP31.Controller.ProdutoController;
import Exercicios.MVC.ATP31.Model.Produto;

import java.util.Scanner;
import java.util.UUID;

public class CasesView {

    static Scanner sc = new Scanner(System.in);
    static ProdutoController pc = new ProdutoController();



    public void case1() {  //criar
        Produto p = new Produto();
        p = retorno(1 , p);
        pc.create(p);
    }


    public static boolean matchesOnlyText(String text) {
        return text.matches("[^\\d]+");
    }

    public void case2(){  // listar
        if(pc.read().isEmpty()){
            System.out.println("A lista está vazia!");
        }else{
            for (Produto pElement : pc.read()) {
                System.out.println(pElement);
            }
        }
    }

    public static void case3() {   //update
        if(pc.read().isEmpty()){
            System.out.println("A lista está vazia!");
        }else {
            Produto p = new Produto();
            p =  retorno(3,p);
            pc.updade(p);
        }

    }

    public static  void case4(){    //delete
        if(pc.read().isEmpty()){
            System.out.println("A lista está vazia!");
        }else {
            Produto p = new Produto();
            p =retorno(4 ,p);
            pc.delete(p);
        }
    }


    public static String lerString(String mensagem) {
        System.out.print(mensagem);
        return sc.nextLine();
    }

    public static boolean validaSoNum(String text) {
        boolean valido = true;

        if(!matchesOnlyText(text)) {
            System.out.println("Não é permitido número");
            return  valido = false;
        }
        else{
            return valido = true;
        }
    }

    public static Produto retorno(int op, Produto p){
        boolean valido = true;

        if(op == 3 || op == 4 ){
            try {
                System.out.println("Digite o id:");
                String Id2 = sc.nextLine();
                UUID id2 = UUID.fromString(Id2);
                p.setId(id2);

            }catch (Exception E) {
                System.out.println("Informação invalida!");

            }
        }

          if(op == 1 || op == 3) {
            do {
                String prod = lerString("Escreva o nome do produto:");
                valido = validaSoNum(prod);
                if (valido) {
                    p.setNome(prod);
                }

            } while (!valido);


            String descricao = lerString("Escreva a descrição:");
            p.setDescricao(descricao);

            do {

                String categoria = lerString("Escreva a categoria:");

                valido = validaSoNum(categoria);
                if (valido) {
                    p.setCategoria(categoria);
                }
            } while (!valido);

            double preco;
            do {
                try {
                    System.out.println("Escreva o preço");
                    preco = Double.parseDouble(sc.nextLine());
                    p.setPreço(preco);
                    valido = true;
                } catch (Exception e) {
                    System.out.println("Preço invalido! tente novamente!");
                    valido = false;
                }

            } while (!valido);
        }
        return p;
    }



}
