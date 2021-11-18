package Exercicios.JavaSwing.ATP51.View;

import java.util.Scanner;

import Exercicios.JavaSwing.ATP51.Dao.PessoaDao;
import Exercicios.JavaSwing.ATP51.Model.Pessoa;

public class DeleteView {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa p = new Pessoa();
        PessoaDao dao = new PessoaDao();

        dao.select();

        System.out.println("\n Digite o id que você desejar deletar?");
        int id = Integer.parseInt(sc.nextLine());
        p.setId(id);

        dao.delete(p);

        dao.select();
    }
    
}
