package Exercicios.Objeto.ATP23.Controller;

import Exercicios.Objeto.ATP23.Model.Livro;

import java.util.ArrayList;

public class LivroController {
    private  ArrayList<Livro> livro;

    public LivroController ( ) {
        livro = new ArrayList<>();
    }


    public void create(Livro l){
        livro.add(l);
    }

    public ArrayList<Livro> read(){
        return livro;
    }

    public  void update(Livro l){
        if(this.livro.contains(l)) {
            delete(l);
            create(l);
        }
    }

    private void delete(Livro l) {
        livro.remove(l);
    }
}
