package Exercicios.MVC.ATP27.View;

import Exercicios.MVC.ATP27.Controller.FilmeController;
import Exercicios.MVC.ATP27.Controller.SerieController;
import Exercicios.MVC.ATP27.Model.Filme;
import Exercicios.MVC.ATP27.Model.Serie;

public class MainView {
    public static void main(String[] args) {
        FilmeController fc = new FilmeController();
        SerieController sc = new SerieController();

        Filme f1 = new Filme();
        Serie s1 = new Serie();

        f1.setTitulo("A lenda do cavaleiro sem cabeça");
        f1.setDescricao("A história ocorre em 1799. O investigador...");
        f1.setGenero("Terror/Mistério");
        f1.setAno(1999);
        fc.creat(f1);


        s1.setTitulo("round 6");
        s1.setQtdEp(9);
        s1.setGenero("Drama");
        s1.setAno(2021);
        sc.creat(s1);

        System.out.println("Filmes cadastrados : "+fc.tamanho());
        System.out.println("Série cadastrados : "+sc.tamanho());


        System.out.println("==========================================================================");

        Filme f2= new Filme();
        Serie s2 = new Serie();

        f2.setTitulo("Piratas do Caribe: A vingança de Salazar");
        f2.setDescricao("O capitão Salazar,lidera uma exército de piratas");
        f2.setGenero("Fantasia/Aventura");
        f2.setAno(2017);
        fc.creat(f2);

        s2.setTitulo("The Great");
        s2.setQtdEp(10);
        s2.setGenero("Comédia dramática");
        s2.setAno(2020);
        sc.creat(s2);

        System.out.println("Filmes cadastrados : "+fc.tamanho());
        System.out.println("Série cadastrados : "+sc.tamanho());

        lista(fc);
        lista(sc);

        if(fc.contains(f1)){
            System.out.println("Contém o filme");
        }
        else {
            System.out.println("Não contém.");
        }

        if(sc.contains(s1)){
            System.out.println("Contém a série");
        }
        else {
            System.out.println("Não contém.");
        }

        System.out.println("==========================================================================");
        Filme f3 = new Filme();
        Serie s3 = new Serie();

        f3.setTitulo("A lenda do cavaleiro sem cabeça");
        f3.setDescricao("A história ocorre em 1799. O investigador...");
        f3.setGenero("Terror/Mistério");
        f3.setAno(1999);
        fc.creat(f3);


        s3.setTitulo("round 6");
        s3.setQtdEp(9);
        s3.setGenero("Drama");
        s3.setAno(2021);
        sc.creat(s3);

        System.out.println("Filmes cadastrados : "+fc.tamanho());
        System.out.println("Série cadastrados : "+sc.tamanho());

        lista(fc);
        lista(sc);

        System.out.println("==========================================================================");

        if(f1.equals(f3) && s1.equals(s3)){
            fc.delete(f3);
            sc.delete(s3);
            System.out.println("Removido com sucesso!");
        }

        System.out.println("Filmes cadastrados : "+fc.tamanho());
        System.out.println("Série cadastrados : "+sc.tamanho());

        lista(fc);
        lista(sc);


    }

    public static void lista(Object obj){
        if(obj instanceof FilmeController){
           FilmeController filmeCon = (FilmeController)obj;
            for (Filme f: filmeCon.read()) {
                System.out.println(f);
            }
        }
        else if(obj instanceof SerieController){
            SerieController filmeCon = (SerieController)obj;
            for (Serie s: filmeCon.read()) {
                System.out.println(s);
            }
        }
    }

}
