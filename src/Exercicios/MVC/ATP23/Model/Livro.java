package Exercicios.MVC.ATP23.Model;

public class Livro extends BaseModel{
    private String titulo;
    private String descricao;
    private String genero;
    private  int anoDeLancamento;

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

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    @Override
    public String toString() {
        return String.format("\n----------------------------\n"+
                "Id: %s\n" +
                "Título: %s\n" +
                "Descrição: %s\n" +
                "Gênero: %s \n" +
                "Ano de lançamento: %d\n",getId().toString(),this.titulo,this.descricao,this.genero,this.anoDeLancamento);
    }

    @Override
    public boolean equals(Object obj) {
        Livro livro = (Livro) obj;

        if(this.getId().equals(livro.getId()) ){
            return true;
        }
        else{
            return false;
        }
    }
}
