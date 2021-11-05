package Exercicios.JavaIO.P1.dao;

import Exercicios.JavaIO.P1.Model.Pessoa;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class PessoaDao extends BaseDao<Pessoa> {
    public PessoaDao() {
        super("src/Ezercicios/JavaIo/P1/Dados/Pessoa.csv");
    }

    public ArrayList<Object> list(){
        ArrayList<Object> pessoas = new ArrayList<Object>();
        try {
            Scanner sc = new Scanner(new File(this.filename));
            while(sc.hasNextLine()){
                String linha = sc.nextLine();
                Pessoa p = new Pessoa(linha);
                pessoas.add(p);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return pessoas;
    }

}