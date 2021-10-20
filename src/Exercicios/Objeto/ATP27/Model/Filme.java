package Exercicios.Objeto.ATP27.Model;

import java.util.Objects;

public class Filme extends BaseId{
    private String titulo;
    private String descricao;
    private  String genero;
    private int ano;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
       return String.format("\nId: %s\n" +
                           "Titulo: %s\n" +
                           "Descrição: %s\n" +
                           "Gênero: %s\n" +
                           "Ano: %d\n",this.getId().toString(),this.titulo,this.descricao,this.genero,this.ano);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Filme){
            Filme filme = (Filme) obj;
            if(this.getId().equals(filme.getId()) ||(this.titulo.equals(filme.titulo)) ){
                return  true;
            }
        }
       return false;
    }

}
