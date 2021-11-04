package Exercicios.MVC.ATP27.Controller;

import java.util.ArrayList;

public class BaseController <B>{
    private ArrayList<B> dados;

    public BaseController(){
        this.dados = new ArrayList<B>();
    }

    public int tamanho(){
        return this.dados.size();
    }


    public void creat(B obj){
        this.dados.add(obj);
    }

    public  ArrayList<B> read(){
        return this.dados;
    }

    public void update(B obj){
        if(contains(obj)){
           delete(obj);
           creat(obj);
        }
    }

    public boolean contains(B obj){
        return this.dados.contains(obj);
    }

    public void delete(B obj){
        this.dados.remove(obj);
    }


}
