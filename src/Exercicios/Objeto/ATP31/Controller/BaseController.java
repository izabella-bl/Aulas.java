package Exercicios.Objeto.ATP31.Controller;

import java.util.ArrayList;

 abstract class BaseController <D>{
    private ArrayList<D> lista;

    public  BaseController(){
        this.lista = new ArrayList<D>();
    }

    public void create(D obj){
        this.lista.add(obj);
    }

    public ArrayList<D> read(){
        return this.lista;
    }

    public void updade(D obj){
        if( existe(obj) ){
            delete(obj);
            create(obj);
        }

    }

    public void delete(D obj){
        this.lista.remove(obj);
    }

    public boolean existe(D obj){
        return this.lista.contains(obj);
    }
}
