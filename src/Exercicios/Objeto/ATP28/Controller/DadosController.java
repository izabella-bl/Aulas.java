package Exercicios.Objeto.ATP28.Controller;

import java.util.ArrayList;

public class DadosController <D> {
    private ArrayList<D> dados;

    public DadosController(){
        this.dados = new ArrayList<D>();
    }

    public void create(D obj){
        this.dados.add(obj);
    }

    public ArrayList<D> read(){
        return dados;
    }

    public void update(D obj){
        if(contains(obj)){
            delete(obj);
            create(obj);
        }
    }

    public void delete(D obj){
        this.dados.remove(obj);
    }


    public boolean contains(D obj){
        return this.dados.contains(obj);
    }

}
