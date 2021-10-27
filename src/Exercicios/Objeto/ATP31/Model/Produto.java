package Exercicios.Objeto.ATP31.Model;

public class Produto extends BaseId{
    private  String nome;
    private  String descricao;
    private  String categoria;
    private  double preço;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    @Override
    public String toString() {
        return String.format("\nId: %s\n" +
                            "Nome: %s\n" +
                            "Descrição: %s\n" +
                            "Categoria: %s\n" +
                            "Preço: R$ %.2f",this.getId().toString(),this.nome,this.descricao,this.categoria,this.preço);
    }
}
