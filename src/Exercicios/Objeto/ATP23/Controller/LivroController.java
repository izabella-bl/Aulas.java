package Exercicios.Objeto.ATP23.Controller;

import Exercicios.Objeto.ATP23.Model.Livro;

import java.util.ArrayList;

public class LivroController {
    private  ArrayList<Livro> livro;

    public LivroController () {
        livro = new ArrayList<>();

    }


    public void create(Livro l){
        livro.add(l);
    }

    public ArrayList<Livro> read(){
        return livro;
    }

    public  void update(Livro l, int op){
        for (int i = 0; i < livro.size(); i++) {

            if(this.livro.get(i).getId().equals(l.getId())) {
                if(op == 1){
                    Livro livroAntigo =  this.livro.get(i);
                    l.setGenero(livroAntigo.getGenero());
                    l.setDescricao(livroAntigo.getDescricao());
                    l.setAnoDeLancamento(livroAntigo.getAnoDeLancamento());
                    livro.set(i,l);

                }
               else if(op == 2){
                    Livro livroAntigo =  this.livro.get(i);
                    l.setGenero(livroAntigo.getGenero());
                    l.setTitulo(livroAntigo.getTitulo());
                    l.setAnoDeLancamento(livroAntigo.getAnoDeLancamento());
                    livro.set(i,l);
                }
               else if(op == 3){
                    Livro livroAntigo =  this.livro.get(i);
                    l.setDescricao(livroAntigo.getDescricao());
                    l.setTitulo(livroAntigo.getTitulo());
                    l.setAnoDeLancamento(livroAntigo.getAnoDeLancamento());
                    livro.set(i,l);
                }
               else if(op == 4){
                    Livro livroAntigo =  this.livro.get(i);
                    l.setGenero(livroAntigo.getGenero());
                    l.setTitulo(livroAntigo.getTitulo());
                    l.setDescricao(livroAntigo.getDescricao());
                    livro.set(i,l);
                }
            }
            else{
                System.out.println("Não possui esse Id na lista");
            }

        }
    }

    public void delete(Livro l) {
        livro.remove(l);
    }

    public boolean contem(Livro l){
        return this.livro.contains(l);
    }

}
