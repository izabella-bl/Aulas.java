package Exercicios.MVC.ATP29.models;

public class Categoria extends BaseId{
    public String descricao;

    @Override
    public String toString() {
        return "\nDescrição: " + descricao;
    }
}
