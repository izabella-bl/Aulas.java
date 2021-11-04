package Exercicios.MVC.ATP27.Model;

public class Serie extends BaseId{
    private String titulo;
    private int qtdEp;
    private  String genero;
    private int ano;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getQtdEp() {
        return qtdEp;
    }

    public void setQtdEp(int qtdEp) {
        this.qtdEp = qtdEp;
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
        return String.format("\nTitulo: %s\n" +
                "Qtd. de Episodio: %s\n" +
                "Gênero: %s\n" +
                "Ano: %d\n",this.titulo,this.qtdEp,this.genero,this.ano);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Serie){
            Serie serie = (Serie) obj;
            if(this.getId().equals(serie.getId()) ||(this.titulo.equals(serie.titulo)) ){
                return  true;
            }
        }
        return false;
    }

}
