package Exercicios.JavaIO.ATP40.PontoTuristico;

public class PontoTuristico {
    public String nome;
    public String descricao;
    public  String localizacao;

    @Override
    public String toString() {
        return this.nome+";"+this.descricao+";"+this.localizacao+"\n";
    }
}
